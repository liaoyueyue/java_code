import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-09
 * Time: 19:11
 */
public class TestDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("你们好我叫阿杰");
            }
        }, 2000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我也常来这里玩");
            }
        }, 4000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我现在还不饿，来给你们吃");
            }
        }, 6000);

        System.out.println("杰哥不要啦：");
    }
}
