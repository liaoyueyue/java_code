import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个数字，判定一个数字是否是素数
 * User: liaoyueyue
 * Date: 2022-04-24
 * Time: 18:36
 */
public class IsprinmeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("判断是否是素数，请输入一个自然数：");
        while (in.hasNext()){
            int num = in.nextInt();
            if(num < 0){
                System.out.println("素数是对自然数而言的，输入错误，请重新输入：");
            } else if (num == 0 || num == 1) {
                System.out.println("0、1不是素数");
            }else {
                int i = 0;
                boolean flag = true;
                for (i = 2; i < Math.sqrt(num); i++) {
                    if(num % i == 0) {
                        flag = false;
                        System.out.println("不是素数");
                        break;
                    }
                }
                if(flag){
                    System.out.println("是素数");
                }

            }

        }

    }

}
