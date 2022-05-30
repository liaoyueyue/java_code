package MyException;

import java.net.PasswordAuthentication;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:这里练习自定义异常类
 * User: liaoyueyue
 * Date: 2022-05-30
 * Time: 21:42
 */

class UserNameException extends Exception {
    public UserNameException(String message) {
        super(message);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

/**
 * 自定义异常通常会继承自 Exception 或者 RuntimeException
 * 继承自 Exception 的异常默认是受查异常
 * 继承自 RuntimeException 的异常默认是非受查异常
 */


public class Login {
    private static String username = "admin";//正确账号
    private String userpassword = "111";//正确密码

    public void loginInfo(String username, String userpassword) throws UserNameException, PasswordException {
        if(!this.username.equals(username)){
            throw new UserNameException("用户名错误");
        }
        if (!this.userpassword.equals(userpassword)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登录成功");
    }

    public static int menu(){
        System.out.println("*********************");
        System.out.println("******1、登录账号******");
        System.out.println("******0、退出系统******");
        System.out.println("*********************");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int choice = in.nextInt();
            return choice;
        } else {
            System.out.println("选择错误");
        }
        return 0;
    }

    public static void main(String[] args) {
        if (menu() == 1) {
            Login login = new Login();
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("请输入登录的用户名");
                String inputname = in.nextLine();
                System.out.println("请输入登录的密码");
                String inputword = in.nextLine();
                login.loginInfo(inputname, inputword);
            } catch (UserNameException e) {
                e.printStackTrace();
            } catch (PasswordException e) {
                e.printStackTrace();
            } finally {
                in.close();
            }
            System.out.println("before try catch");

        } else {
            System.out.println("已退出系统");
            System.exit(0);
        }
    }
}
