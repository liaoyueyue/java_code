import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:练习使用多线程
 * User: liaoyueyue
 * Date: 2022-12-18
 * Time: 13:46
 */
public class TestThread {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                //打印线程名字
                System.out.println(Thread.currentThread().getName());
                try {
                    //随机停止运行0~9ms
                    Thread.sleep(random.nextInt(10));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();

        Random random = new Random();
        while (true) {
            //打印线程名字
            System.out.println(Thread.currentThread().getName());
            try {
                //随机停止运行0~9ms
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
