package StudentScoreManageSystem.operation;

import StudentScoreManageSystem.student.SClass;

public class FindOperation implements IOperation{
    @Override
    public void work(SClass sClass) {
        System.out.println("查找学生");
    }
}
