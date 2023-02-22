import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-02-15
 * Time: 13:09
 */

public class Function {
    private double a;
    private double b;
    private double c;

    public Function(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String Root() {
        String s = "";
        if (a == 0) { //b*x + c
            if (b == 0) { // c
                if (c == 0) {
                    s = "方程的解为任意实数";
                } else {
                    s = "无解";
                }
            } else { //b*x + c
                s = s + (-c / b);
            }
        } else { //a*x*x + b*x + c
            double d = b*b -4*a*c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                s = s + x1 +" " + x2;
            } else if (d == 0) {
                double x1 = (-b + Math.sqrt(d))/(2*a);
                s = s + x1;
            } else {
                System.out.println("方程无解");
            }
        }
        return s;
    };
}

class MyTest {
    public static void main(String[] args) {
        double a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("输入a, b ,c");
        a= in.nextDouble();
        b= in.nextDouble();
        c= in.nextDouble();
        Function function = new Function(a, b , c);
        System.out.println(function.Root());
    }
}