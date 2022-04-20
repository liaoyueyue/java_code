/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-21
 * Time: 21:23
 */

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("这是一个偶数");
        }else{
            System.out.println("这是一个奇数");
        }
    }
}
