/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-01-08
 * Time: 17:35
 */

/**
 * 使用两个线程来累加count值
 * 每个线程循环 1w 次，累加变量 count 的值，count 默认值为 0，注意线程安全问题。
 */

public class Example1 {
    public static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1_0000; i++) {
                    count++;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1_0000; i++) {
                    count++;
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
