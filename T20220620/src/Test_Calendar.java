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

        //获取Calendar的实例
        Calendar calendar=Calendar.getInstance();
        //循环遍历所有的月份
        for(int month=1;month<=12;month++){
            //设置年、月、日
            calendar.set(year,month,0);
            //输出对应年份各个月的天数
            System.out.println(year+"年"+month+"月:"+calendar.getActualMaximum(Calendar.DATE)+"天");
        }
    }
}
