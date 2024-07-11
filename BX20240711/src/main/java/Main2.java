import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: dd爱框框 https://ac.nowcoder.com/acm/contest/11211/F 没做出 20%通过
 * User: liaoyueyue
 * Date: 2024-07-11
 * Time: 16:09
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int x = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(func(x, arr, n));
        }
    }

    private static String func(int x, int[] arr, int n) {
        int minLen = Integer.MAX_VALUE;
        int l = -1;
        int r = -1;
        for (int i = 0; i < n - 1; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum >= x) {
                    if (j - i < minLen) {
                        minLen = j - i;
                        l = i + 1;
                        r = j + 1;
                    }
                    break;
                }
            }
        }
        return l + " " + r;
    }
}
