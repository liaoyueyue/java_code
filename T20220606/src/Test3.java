/**
 * Created with IntelliJ IDEA.
 * Description:在不使用第三个变量的情况下交换两个int类型变量的值
 * User: liaoyueyue
 * Date: 2022-06-06
 * Time: 10:50
 */
public class Test3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("old:a="+a+", b="+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("new:a="+a+", b="+b);
    }
}
