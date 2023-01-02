/**
 * Created with IntelliJ IDEA.
 * Description:通过自定义标志位来结束线程
 * User: liaoyueyue
 * Date: 2023-01-02
 * Time: 17:18
 */
public class InterruptedThread1 {
    private static boolean isQuit;
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (!isQuit) {
                System.out.println(Thread.currentThread().getName() + ": 我还活着");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isQuit = true;
        System.out.println("设置让t线程结束");
    }
}
