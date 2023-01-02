/**
 * Created with IntelliJ IDEA.
 * Description:测试join的用法
 * User: liaoyueyue
 * Date: 2023-01-02
 * Time: 18:56
 */
public class TestJoin {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "我在运行");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();

        System.out.println("t.join前");
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t.join后");
    }
}
