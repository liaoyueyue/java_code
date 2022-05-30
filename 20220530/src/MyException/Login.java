package MyException;

import java.net.PasswordAuthentication;

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
    private String username = "admin";
    private String userpassword = "111";

    public void loginInfo(String username, String userpassword) throws UserNameException, PasswordException {
        if(!this.username.equals(username)){
            throw new UserNameException("用户名错误");
        }
        if (!this.userpassword.equals(userpassword)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登录成功");
    }

    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.loginInfo("admin", "11");
        } catch (UserNameException e) {
            e.printStackTrace();
        } catch (PasswordException e) {
            e.printStackTrace();
        }
        System.out.println("before try catch");
    }
}
