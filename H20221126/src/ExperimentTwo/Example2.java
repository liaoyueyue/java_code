package ExperimentTwo;

/**
 * Created with IntelliJ IDEA.
 * Description:计算1---50之间所有素数的和
 * User: liaoyueyue
 * Date: 2022-11-26
 * Time: 14:04
 */
public class Example2 {
    public static final int N = 50;

    public static void main(String[] args) {
        int sum = 2;
        for (int i = 3; i < N; i += 2) {    //这里+2是因为偶数不为素数
            if (isPrimeNumber(i)) {     //素数只能被1或者自身整除
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrimeNumber(int n) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {   // a*b=4, a或者b至少有一个小于等于根号下4
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
