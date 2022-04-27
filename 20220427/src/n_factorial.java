import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-27
 * Time: 22:18
 */
public class n_factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal sum = new BigDecimal(1);
        System.out.println("求n的阶乘请先输入n：");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            BigDecimal i_value = new BigDecimal(i);
            sum = sum.multiply(i_value);
        }
        System.out.println(n+"的阶乘为"+sum);
    }
}
