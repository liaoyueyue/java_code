import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:递归求斐波那契数列的第 N 项
 * User: liaoyueyue
 * Date: 2022-04-29
 * Time: 19:14
 */
public class fib_array_recursion {
    private static int return_fib(int n) {
        if (n == 1 || n == 2){
            return 1;
        }else{
            return return_fib(n-1)+return_fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(return_fib(n));
    }


}
