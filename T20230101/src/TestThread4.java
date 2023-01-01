/**
 * Created with IntelliJ IDEA.
 * Description:实现 Runnable, 重写 run, 使用匿名内部类
 * User: liaoyueyue
 * Date: 2023-01-01
 * Time: 22:47
 */
public class TestThread4 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("实现 Runnable, 重写 run, 使用匿名内部类");
            }
        });
        t.start();
    }
}
