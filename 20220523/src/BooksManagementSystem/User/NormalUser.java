package BooksManagementSystem.User;

import BooksManagementSystem.BookListOperation.*;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-25
 * Time: 16:43
 */
public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("欢迎来到图书管理系统");
        System.out.println("1、查找图书");
        System.out.println("2、借阅图书");
        System.out.println("3、归还图书");
        System.out.println("0、退出系统");
        System.out.println("请输入你的选择");
        do{
            Scanner in = new Scanner(System.in);//创建键盘录入对象
            if(in.hasNextInt()){//这里判断输入字符是不是数字
                int choice= in.nextInt();//给choice赋值
                if(choice == 0 || choice == 1 || choice == 2 || choice == 3){
                    return choice;
                }else{
                    System.out.println("没有该选项，请重新输入");
                }
            }else{
                System.out.println("输入错误，请重新输入");
            }
        }while (true);
    }
}
