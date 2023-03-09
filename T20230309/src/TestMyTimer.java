import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:这里测试自己写一个定时器
 * User: liaoyueyue
 * Date: 2023-03-09
 * Time: 19:07
 */

class MyTask implements Comparable<MyTask> {
    private Runnable runnable;

    private long time;

    public MyTask(Runnable runnable, long delay) {
        this.runnable = runnable;
        this.time = System.currentTimeMillis()+delay;
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public long getTime() {
        return time;
    }

    @Override
    public int compareTo(MyTask o) {
        return (int)(this.time - o.time);
    }
}
class MyTimer {
    private BlockingQueue<MyTask> queue = new PriorityBlockingQueue<>();

    private Object locker = new Object();
    public MyTimer() {
        //扫描线程
        Thread t = new Thread(() -> {
            System.out.println("进入扫描线程");
            while (true) {
                try {
                    synchronized (locker) {
                        //取队首元素
                        MyTask take = queue.take();
                        long curTime = System.currentTimeMillis();
                        if (System.currentTimeMillis() >= take.getTime()) {
                            take.getRunnable().run();
                        } else {
                            //如果没有到时间
                            queue.put(take);
                            //如果没有到时间就进行等待
                            locker.wait(take.getTime() - curTime);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }
    
    public void schedule(Runnable runnable, long after) throws InterruptedException {
        MyTask myTask = new MyTask(runnable, after);
        queue.put(myTask);
        synchronized (locker) {
            locker.notify();
        }
    }
}

public class TestMyTimer {
    public static void main(String[] args) throws InterruptedException{
        MyTimer myTimer = new MyTimer();
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("时间到1");
            }
        }, 3000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("时间到2");
            }
        }, 4000);
        myTimer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("时间到3");
            }
        }, 5000);
        System.out.println("开始计时");
    }
}
