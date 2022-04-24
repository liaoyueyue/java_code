import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-23
 * Time: 16:47
 */

//猜数字1~100内

public class FindNum {
    public static void main(String[] args) {
        Random random = new Random();//这里未加入seed,所以是真随机数
        int num=random.nextInt(100)+1;//生成的数是0到99即[0，100)，因为这里生成后加了1，所以生成了[1，100]的整数
        System.out.println("进入猜数字游戏，请输入1~100整数");
        System.out.println("请输入猜的数字");
        Scanner in = new Scanner(System.in);
        while(true){
            int input = in.nextInt();
            if(num < input){
                System.out.println("猜大了");
            } else if (num == input) {
                System.out.println("猜对了");
                break;
            }else{
                System.out.println("猜小了");
            }
        }
    }
}
