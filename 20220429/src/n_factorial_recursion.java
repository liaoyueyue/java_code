import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:递归求 N 的阶乘
 * User: liaoyueyue
 * Date: 2022-04-29
 * Time: 21:23
 */
public class n_factorial_recursion {

    public static int FactorialRecursion(int n){
        if(n == 1){
            return 1;
        }else{
            return n*FactorialRecursion(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(FactorialRecursion(n));
    }
}
