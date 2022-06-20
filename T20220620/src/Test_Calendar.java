import java.util.Calendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:测试常用API,日期Calendar
 * User: liaoyueyue
 * Date: 2022-06-20
 * Time: 17:01
 */
public class Test_Calendar {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        Calendar c = Calendar.getInstance();
        for (int month = 1; month <= 12; month++) {
            c.set(year, month, 1);
            c.add(Calendar.DATE, -1);
            int days = c.get(Calendar.DATE);
            System.out.println(year + "年" + month + "月:" + days + "天");
        }
    }
}
