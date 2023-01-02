/**
 * Created with IntelliJ IDEA.
 * Description: 测试线程的使用
 * User: liaoyueyue
 * Date: 2023-01-02
 * Time: 15:55
 */

/**
 * 在子线程执行完毕后再执行主线程代码
 * 有20个线程，需要同时启动。
 * 每个线程按0-19的序号打印，如第一个线程需要打印0
 * 请设计代码，在main主线程中，等待所有子线程执行完后，再打印 ok
 */

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for(int i=0; i<20; i++){
            final int n = i;
            threads[i] = new Thread(() -> {
                        System.out.println(n);
            });
        }
        for(Thread t : threads){
            t.start();
        }
        for(Thread t : threads){
            t.join();
        }
        System.out.println("OK");
    }
}
