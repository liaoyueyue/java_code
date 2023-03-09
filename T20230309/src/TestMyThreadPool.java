import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-09
 * Time: 21:55
 */

class MyThreadPool {
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public MyThreadPool(int m) {
        //在构造方法里创建m个线程来负责工作
        for (int i = 0; i < m; i++) {
            Thread t = new Thread(() -> {
                while (true) {
                    try {
                        Runnable runnable = queue.take();
                        runnable.run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
        }
    }

    public void submit(Runnable runnable) throws InterruptedException {
        queue.put(runnable);
    }


}
public class TestMyThreadPool {
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool myThreadPool = new MyThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            int taskId = i;
            myThreadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("执行当前任务" + taskId +  "当前线程" + Thread.currentThread().getName());
                }
            });
        }
    }

}
