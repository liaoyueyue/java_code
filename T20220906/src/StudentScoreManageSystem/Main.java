package StudentScoreManageSystem;

import StudentScoreManageSystem.student.SClass;
import StudentScoreManageSystem.user.AdminUser;
import StudentScoreManageSystem.user.NormalUser;
import StudentScoreManageSystem.user.User;

import java.util.Scanner;

public class Main {
    public static User login() {
        System.out.println("请输入你的名字");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("请输入你的身份");
        System.out.println("1. 普通用户");
        System.out.println("0. 管理员用户");
        int choice = in.nextInt();

        if (choice == 0) {
            return new AdminUser(name);
        } else {
            return new NormalUser(name);
        }
    }

    public static void main(String[] args) {
        //初始化班级
        SClass sClass = new SClass();
        //下面开始登录
        User user = login();//向上转型
        while (true){
            int choice = user.menu();//这里由菜单方法返回对应选择的方法
            user.doOperation(choice, sClass);//执行对应选择的方法
        }
    }
}
