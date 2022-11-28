package StudentScoreManageSystem.operation;

import StudentScoreManageSystem.student.SClass;
import StudentScoreManageSystem.student.Student;

import java.util.Scanner;

public class AddOperation implements IOperation {
    @Override
    public void work(SClass sClass) {
        int size = sClass.getUserSize();
        String id;//学生的学号
        String name;//学生的姓名
        int age;//学生的年龄
        double mathScore;//数学成绩
        double physicsScore;//物理成绩
        double englishScore;//英语成绩
        Scanner in = new Scanner(System.in);
        System.out.println("请分别输入要添加的学生的学号、姓名、年龄、数学成绩、物理成绩、英语成绩");
        id = in.next();
        name = in.next();
        age = in.nextInt();
        mathScore = in.nextDouble();
        physicsScore = in.nextDouble();
        englishScore = in.nextDouble();
        sClass.setStudent(size,new Student(id, name, age, mathScore, physicsScore, englishScore));
        sClass.setUserSize(size+1);
        System.out.println("添加学生信息完毕");
    }
}
