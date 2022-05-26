package BooksManagementSystem;

import BooksManagementSystem.User.AdminUser;
import BooksManagementSystem.User.NormalUser;
import BooksManagementSystem.User.User;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:主函数
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 20:37
 */
public class main {
    public static User login(){
        System.out.println("请输入你的身份\n1、普通用户\n2、图书管理员");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        System.out.println("请输入你的用户名");
        String temp = in.nextLine();//这里回收一下换行符"\n"
        temp = null;//释放该变量内存
        String name = in.nextLine();
        if (choice == 1) {
            System.out.println("普通用户"+name+"登录成功");
            return new NormalUser(name);
        }else{
            System.out.println("图书管理员"+name+"登录成功");
            return new AdminUser(name);
        }

    }
    public static void main(String[] args) {
        BookList bookList = new BookList(); //首先初始化图书架
        User user = login();//不同的身份登录
        while (true) {
            int choice = user.menu();//这里会发生动态绑定，不同的身份会触发不同的菜单,把选择的操作保存
            user.doOperation(choice, bookList);//对图书架进行各类操作
        }

    }
}
