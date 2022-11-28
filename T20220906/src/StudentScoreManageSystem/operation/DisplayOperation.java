package StudentScoreManageSystem.operation;

import StudentScoreManageSystem.student.SClass;

public class DisplayOperation implements IOperation{
    @Override
    public void work(SClass sClass) {
        System.out.println("列出学生信息");
        for (int i = 0; i < sClass.getUserSize(); i++) {
            System.out.println(sClass.getStudent(i).toString());
        }
    }
}
