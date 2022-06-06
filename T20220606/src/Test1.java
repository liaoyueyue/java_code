/**
 * Created with IntelliJ IDEA.
 * Description:输入两个正整数a和b，输出这两个正整数的和，差，积，商，模（若a>b则输出a-b，a/b，a%b的值反之输出b-a，b/a，b%a的值，不考虑小数，请使用int类型）
 * User: liaoyueyue
 * Date: 2022-06-06
 * Time: 10:39
 */
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if(b>a){
            int temp = a;
            a=b;
            b=temp;
        }
        System.out.printf("%d %d %d %d %d", a + b, a - b, a * b, a / b, a % b);
    }
}