package StudentScoreManageSystem.user;

import StudentScoreManageSystem.operation.*;
import StudentScoreManageSystem.student.SClass;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name) {
        super(name);
        this.iOperations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new StatisticsOperation(),
                new SortOperation()
        };
    }

    public int menu(){
        System.out.println("-------------欢迎进入学生信息管理系统-------------");
        System.out.println("-------------1. 学生信息查找       -------------");
        System.out.println("-------------2. 统计分析学生成绩    -------------");
        System.out.println("-------------3. 按成绩进行排序     -------------");
        System.out.println("-------------0. 退出系统          -------------");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        return choice;
    }


}
