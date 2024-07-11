import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 没做出
 * User: liaoyueyue
 * Date: 2024-07-11
 * Time: 16:17
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(func(k, arr, n));
        }
    }

    private static int func(int k, int[] arr, int n) {
        while (k > 0) {
            // 找最大的偶数除以2
            int evenMax = -1;
            int evenMaxIndex = -1;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0 && arr[i] > evenMax) {
                    evenMax = arr[i];
                    evenMaxIndex = i;
                }
            }
            // 数组中没有偶数
            if (evenMaxIndex == -1) {
                break;
            }
            arr[evenMaxIndex] /= 2;
            k--;
        }
        return getArrSum(arr, n);
    }

    private static int getArrSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
