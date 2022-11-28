package ExperimentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description: Result=1!+2!+3!+…+10!
 * User: liaoyueyue
 * Date: 2022-11-26
 * Time: 13:57
 */
public class Example1 {
    public static final int N = 10;

    public static void main(String[] args) {
        int sum = 0;
        int temp;
        for (int i = 1; i <= N; i++) {
            temp = 1;
            for (int j = 1; j <= i; j++) {
                temp *= j;
            }
            sum += temp;
        }
        System.out.println(sum);
    }
}
