import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-02-15
 * Time: 12:40
 */
public class Test {
    public static void main(String[] args) {
        double a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("输入三角形的三条边");
        a= in.nextDouble();
        b= in.nextDouble();
        c= in.nextDouble();
        if (isTriangle(a, b, c)) {
            System.out.println("周长为" + (a + b + c));
            double p =(a+b+c) / 2;
            System.out.println("面积为：" + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        }else {
            System.out.println("构不成三角形");
        }
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

}
