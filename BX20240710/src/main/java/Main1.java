import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-10
 * Time: 15:24
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextFloat()) {
            float a = in.nextFloat();
            char b = in.next().charAt(0);

            int sum = 20;
            if (a > 1) {
                float c = a - 1;
                if (c % 1 != 0) { // 有小数
                    sum += (int) c + 1;
                } else {
                    sum += (int) c;
                }
            }
            if (b == 'y'){
                sum += 5;
            }
            System.out.println(sum);
        }
    }
}
