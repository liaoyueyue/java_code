import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:这里十进制转化为二进制
 * User: liaoyueyue
 * Date: 2022-06-17
 * Time: 22:43
 */
public class DecimalismTOBinary {
    /**
     * 这里适合用C或者C++语言来写
     */

    public static int fact(int n) {
        if (n < 2) return n;
        else return fact(n / 2) * 10 + n % 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            System.out.printf("%d\n", fact(num));
        }
    }


    /**
     * 这里方法还有待提升
     */
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            System.out.println("0");
        }
        int i = 1;
        int sum = 0;
        while (num != 1){
            sum += (num % 2) * i;
            i *= 10;
            num /= 2;
        }
        sum += i;
        System.out.println(sum);
    }

    /**
     * 这里采用自带方法
     */
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(Integer.toBinaryString(num));
    }
}

/**
 * 在Integer类型中有静态方法toBinaryString(int i),这个方法的功能是十进制转换为二进制输出
 */
