/**
 * Created with IntelliJ IDEA.
 * Description:在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
 * User: liaoyueyue
 * Date: 2022-04-27
 * Time: 17:13
 */

public class sum_overload {
    public static int Add(int x, int y) {
        return x + y;
    }

    public static double Add(double x, double y, double z) {
        return x + y + z;
    }

    public static void main(String[] args) {
        int a = 2, b = 3;
        double c = 2.5, d = 3.5, e = 4.0;
        System.out.println(Add(a, b));
        System.out.println(Add(c, d, e));
    }
}
