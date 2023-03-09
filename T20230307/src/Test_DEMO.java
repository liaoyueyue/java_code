import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-03-07
 * Time: 21:23
 */
public class Test_DEMO {
    public static void main(String[] args) {
        //Timer 内部需要一组线程来执行注册的任务，而这里的线程的前台线程,前台线程是会阻止我们的进程退出（后台线程我们称守护线程，判断前后台isDaemon）
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("时间到");
            }
        }, 3000);
        System.out.println("开始计时");
    }
}
