/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-01-02
 * Time: 19:47
 */
public class TestThreadSleep {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("线程开始休眠五秒");
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);//休眠1秒
                    System.out.println(i+1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("已经休眠了五秒");
        });
        thread.start();
    }
}
