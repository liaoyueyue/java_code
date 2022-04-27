/**
 * Created with IntelliJ IDEA.
 * Description:在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
 * User: liaoyueyue
 * Date: 2022-04-27
 * Time: 21:26
 */
public class MaxOverload {
    public static int Max(int x, int y) { //此方法求两个整数的最大值
        return x>y?x:y;
    }
    public static double Max(double x, double y) { //此方法求两个小数的最大值
        return x>y?x:y;
    }
    public static void Max(double x, double y,int z) { //此方法求两个小数和一个整数的大小关系
        double max = (x>y?x:y)>z?(x>y?x:y):z;
        double min = (x<y?x:y)<z?(x<y?x:y):z;
        System.out.println(min+"<"+(x+y+z-max-min)+"<"+max);
    }
    public static void main(String[] args) {

        int a = 6, b = 8;   //定义两个整数a,b
        double c = 5.1, d = 6.6;    //定义两个小数c,d
        System.out.println("两个整数的最大值:"+Max(a, b));
        System.out.println("两个小数的最大值:"+Max(c, d));
        Max(c, d, b);   //打印出两个小数和一个整数的大小关系
    }
}
