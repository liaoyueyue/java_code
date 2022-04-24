/**
 * Created with IntelliJ IDEA.
 * Description:打印 1 - 100 之间所有的素数
 * User: liaoyueyue
 * Date: 2022-04-24
 * Time: 16:00
 */
public class PrintPrimeNum {

    public static void main(String[] args) {
        int count = 0; //定义一个变量来计数
        for (int i = 1; i <= 100; i++) {   //偶数不能是素数
            int j = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {    //素数只能被1或者自己整除，这里如果i被整除则不是素数
                    break;
                }
            }
            if(i == j){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.print("\n一共有"+count+"个素数");
    }


    public static void main1(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i += 2) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+"  ");
                count++;
            }
        }
        System.out.println("\n一共："+count+"个素数");
    }
}
