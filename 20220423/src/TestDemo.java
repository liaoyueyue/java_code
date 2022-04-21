import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-23
 * Time: 15:11
 */

//        1~100奇偶数的和

public class TestDemo {
    public static void main(String[] args) {
        int i = 1;
        int sum1 = 0;//存奇数
        int sum2 = 0;//存偶数
        while(i <= 100){
            sum1 += i;
            i += 2;
        }
        i = 0;
        while(i<=100){
            sum2 += i;
            i += 2;
        }
        System.out.println("1~100奇数和:"+sum1);
        System.out.println("1~100偶数和:"+sum2);
    }

    public static void main2(String[] args) {
        int i=0;
        int sum1=0;
        int sum2=0;
        while(i<=100){
            if(i%2==0){
                sum1+=i;
            }
            if(i%2==1){
                sum2+=i;
            }
            i++;
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
