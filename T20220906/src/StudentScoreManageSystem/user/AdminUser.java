package StudentScoreManageSystem.user;

import StudentScoreManageSystem.operation.*;

import java.util.Scanner;

public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);
        this.iOperations = new IOperation[] {
                new ExitOperation(),
                new AddOperation(),
                new DelOperation(),
                new UpdateOperation(),
                new FindOperation(),
                new DisplayOperation(),
                new SortOperation(),
                new SaveOperation()
        };
    }

    public int menu(){
        System.out.println("-------------欢迎进入学生信息管理系统-------------");
        System.out.println("-------------1. 添加学生信息       -------------");
        System.out.println("-------------2. 删除学生信息       -------------");
        System.out.println("-------------3. 学生成绩修改       -------------");
        System.out.println("-------------4. 学生信息查找       -------------");
        System.out.println("-------------5. 统计分析学生成绩    -------------");
        System.out.println("-------------6. 按成绩进行排序     -------------");
        System.out.println("-------------7. 保存文件          -------------");
        System.out.println("-------------0. 退出系统          -------------");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        return choice;
    }
}
