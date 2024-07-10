import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-08
 * Time: 23:09
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int l = in.nextInt();
            int r = in.nextInt();
            int count = 0;
            for (int i = l; i <= r; i++) {
                count += func(i);
            }
            System.out.println(count);
        }
    }

    public static int func(int num) {
        if(num == 0) {
            return 0;
        }
        if(num % 10 == 2) {
            return 1 + func(num / 10);
        }
        return func(num / 10);
    }
}
