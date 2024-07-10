import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-10
 * Time: 16:19
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            String str1 = in.next();
            String str2 = in.next();
            String[] strs = new String[n];
            for (int i = 0; i < n; i++) {
                strs[i] = in.next();
            }
            System.out.println(func(str1, str2, strs, n));
        }

    }

    private static int func(String str1, String str2, String[] strs, int n) {
        if (str1 == null || str2 == null) {
            return -1;
        }
        int l = -1;
        int r = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (strs[i].equals(str1)) {
                l = i;
            } else if (strs[i].equals(str2)) {
                r = i;
            }
            if (l != -1 && r != -1) {
                min = Math.min(min, Math.abs(l - r));
            }
        }
        if (l == -1 || r == -1) {
            return -1;
        }
        return min;
    }
}
