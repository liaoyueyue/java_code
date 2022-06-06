/**
 * Created with IntelliJ IDEA.
 * Description:定义一个int类型变量i,i为由浮点数变量d四舍五入后的整数类型，请将转换后的i进行输出
 * User: liaoyueyue
 * Date: 2022-06-06
 * Time: 10:44
 */
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d= scanner.nextDouble();

        //write your code here......
        int i=0;
        if(d>0){
            i =  (int)(d+0.5);
        }
        else
        {
            i =  (int)(d-0.5);
        }
        System.out.println(i);
    }
}