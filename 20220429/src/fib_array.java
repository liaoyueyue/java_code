import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求斐波那契数列的第n项。(迭代实现)
 * User: liaoyueyue
 * Date: 2022-04-29
 * Time: 19:14
 */
public class fib_array {
    private static int fib(int n) {
        if (n == 1 || n == 2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fib(n));
    }


}
