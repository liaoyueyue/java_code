/**
 * Created with IntelliJ IDEA.
 * Description:测试给线程加锁
 * User: liaoyueyue
 * Date: 2023-01-04
 * Time: 16:49
 */

class Counter {
    public int count = 0;
    public synchronized void increase() {   //synchronized来修饰一个普通方法的时候就会加锁，方法执行完就会解锁
        count++;
    }
}
public class TestSynchronized {
    private static Counter counter = new Counter();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5_0000; i++) {
                counter.increase();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5_0000; i++) {
                counter.increase();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}
