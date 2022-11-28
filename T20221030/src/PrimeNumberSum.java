/**
 * Created with IntelliJ IDEA.
 * Problem:1~50之间所有素数的和
 * Name: 严显鹏
 * Class: 21软工本1
 * Date: 2022-10-30
 */
public class PrimeNumberSum {
    public static void main(String[] args) {
        int sum = 2;
        for (int i = 3; i <= 50; i+=2) { //这里是因为偶数不是素数
            int flag = 1; //假如i是素数
            for (int j = 2; j <= Math.sqrt(i); j++) {   //这里是因为：如果有a*b=c的话a和b一定是有一个小于等于c的开方的
                if (i % j == 0) {   //素数只能被1和本身整除
                    flag = 0; //i不是素数
                    break;
                }
            }
            if (flag == 1) {
                System.out.print("2 ");
                System.out.print(i+" ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("1~50之间所有素数的和为："+ sum);
    }
}
