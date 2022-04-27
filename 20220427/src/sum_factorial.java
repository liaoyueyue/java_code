import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求1！+2！+3！+4！+........+n!的和
 * User: liaoyueyue
 * Date: 2022-04-27
 * Time: 17:27
 */
public class sum_factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal factorial = new BigDecimal(1);//定义一个大数来存某个数的阶乘
        BigDecimal sum = new BigDecimal(0);//定义一个大数来存阶乘的和
        System.out.println("请输入n:");
        int n = in.nextInt();//导入n
        for (int i = 1; i <= n; i++) {
            BigDecimal i_value = new BigDecimal(i);//将整形的i转化为BigDecimal型
            factorial = factorial.multiply(i_value);//让factorial乘以转化后的i然后重新赋值给factorial
            sum = sum.add(factorial);//将阶乘存入sum2
        }
        System.out.println("1！+2！+3！+4！+...+"+n+"!="+sum);
    }
}
