import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: Fibonacci数列
 * User: liaoyueyue
 * Date: 2024-07-12
 * Time: 16:07
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int i = 2;
            int fibonacciNum = 1;
            while (fibonacciNum < n) {
                fibonacciNum = getFibonacci(++i);
            }
            int k = Math.min(fibonacciNum - n, n - getFibonacci(i - 1));
            System.out.println(k);
        }
    }

    private static int getFibonacci(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            int f = getFibonacci(i - 1);
            int s = getFibonacci(i - 2);
            return f + s;
        }
    }

}
