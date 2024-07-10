import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 没做出
 * User: liaoyueyue
 * Date: 2024-07-10
 * Time: 15:54
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            // 从下标为 0 开始
            int sum1 = arr[0];
            for (int i = 1; i < n - 1; ) {
                if (arr[i] < arr[i + 1]) {
                    sum1 += arr[i];
                    i++;
                } else {
                    sum1 += arr[i + 1];
                    i = i + 2;
                }
            }
            // 从下标为 1 开始
            int sum2 = arr[1];
            for (int i = 2; i < n - 1; ) {
                if (arr[i] < arr[i + 1]) {
                    sum1 += arr[i];
                    i++;
                } else {
                    sum1 += arr[i + 1];
                    i = i + 2;
                }
            }
            if (sum1 < sum2) {
                System.out.println(sum1);
            } else {
                System.out.println(sum2);
            }
        }
    }
}
