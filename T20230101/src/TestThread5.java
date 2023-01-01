/**
 * Created with IntelliJ IDEA.
 * Description:使用 lambda 表达式创建线程
 * User: liaoyueyue
 * Date: 2023-01-01
 * Time: 22:49
 */
public class TestThread5 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("使用 lambda 表达式创建线程");
        });
        t.start();
    }
}
