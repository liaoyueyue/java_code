import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:求斐波那契数列的第n项。(迭代实现)
 * User: liaoyueyue
 * Date: 2022-04-29
 * Time: 20:06
 */
public class fib_array {
    public static int return_fib(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            int a = 1;
            int b = 1;
            int c = 1;
            for (int i = 0; i < n-2; i++) {
                a=b;
                b=c;
                c = a + b;
            }
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(return_fib(n));
    }
}
