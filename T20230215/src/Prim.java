/**
 * Created with IntelliJ IDEA.
 * Description:100~1000内素数之和
 * User: liaoyueyue
 * Date: 2023-02-15
 * Time: 14:35
 */
public class Prim {
    static int sum;

    static void find(int k) {
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                break;
            }
            if (i == k) {
                sum += k;
            }
        }
    }
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i++) {
            find(i);
            System.out.println(sum);
        }
    }
}
