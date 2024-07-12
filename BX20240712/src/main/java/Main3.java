import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 杨辉三角
 * User: liaoyueyue
 * Date: 2024-07-12
 * Time: 17:31
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                a[i][0] = 1;
                a[i][i] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.printf("%5d", a[i][j]);
                }
                System.out.println();
            }
        }
    }
}
