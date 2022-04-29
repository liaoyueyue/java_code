import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:写一个递归方法，输入一个非负整数，返回组成它的数字之和
 * User: liaoyueyue
 * Date: 2022-04-29
 * Time: 19:44
 */
public class return_sum {
    public static int ReturnSum(int n) {
        if(n == 0){
            return 0;
        }else{
           int k = n %10;
            return k+ReturnSum(n/10);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个非负整数");
        int n = in.nextInt();
        System.out.println(ReturnSum(n));
    }
}
