import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 游游的you https://www.nowcoder.com/questionTerminal/cd117803b3364b218a8b3dcc498dee25?page=1&onlyReference=false
 * User: liaoyueyue
 * Date: 2024-07-13
 * Time: 15:04
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                int t1 = Math.min(Math.min(a, b), c);
                int t2 = Math.max(0, b - t1 - 1);
                System.out.println(t1 * 2 + t2);
            }
        }
    }
}
