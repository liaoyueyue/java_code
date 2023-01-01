/**
 * Created with IntelliJ IDEA.
 * Description:继承 Thread, 重写 run, 使用匿名内部类
 * User: liaoyueyue
 * Date: 2023-01-01
 * Time: 22:44
 */
public class TestThread3 {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println("继承 Thread, 重写 run, 使用匿名内部类");
            }
        };
        t.start();
    }
}
