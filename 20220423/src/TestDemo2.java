/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-23
 * Time: 15:33
 */

//1、5的阶乘
//2、5的阶乘的和

public class TestDemo2 {
    public static void main(String[] args) {
        int i=1;
        int ret=1;
        int sum=0;
        while(i<=5){
            int j=1;
            while(j<=5){
                ret *= j;
                j++;
            }
            sum += ret;
        }
        System.out.println(sum);
    }

    public static void main1(String[] args) {
        int i = 1;
        int ret = 1;
        while(i <= 5){
            ret *= i;
            i++;
        }
        System.out.println(ret);
    }
}
