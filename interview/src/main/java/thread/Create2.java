package thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-11
 * Time: 0:28
 */
public class Create2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunable());
        t.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Create2.run");
            }
        });
        t2.start();
        Thread t3 = new Thread(() -> System.out.println("Create2.run"));
        t3.start();
    }
}

class MyRunable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
