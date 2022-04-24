import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-23
 * Time: 23:44
 */

//模拟登陆

/*编写代码模拟三次密码输入的场景。
最多能输入三次密码，密码正确，提示“登录成功”,密码错误，可以重新输入，最多输入三次。
三次均错，则提示退出程序*/

public class SignIn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password ="abcd1234";
        int count = 1;
        System.out.println("请输入密码：");
        while(in.hasNext()) {   //循环输入密码
            String input = in.nextLine();
            if(password.compareTo(input) == 0){
                System.out.println("登录成功");
                break;
            } else if (count < 3) {
                System.out.println("密码错误，还可输入"+(3 - count)+"次密码");
                count++;
            }else {
                System.out.println("退出程序");
                break;
            }
        }

    }
}
