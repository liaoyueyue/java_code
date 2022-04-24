import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求两个正整数的最大公约数
 * User: liaoyueyue
 * Date: 2022-04-24
 * Time: 13:16
 */
public class MaxCommonDivisor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入两个整数");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = 0;
        while((c = a % b) != 0){
            a = b;
            b = c;
        }
        System.out.println("最大公约数位："+b);
    }
}
