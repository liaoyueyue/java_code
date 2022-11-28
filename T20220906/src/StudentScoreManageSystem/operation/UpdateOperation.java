package StudentScoreManageSystem.operation;

import StudentScoreManageSystem.student.SClass;

public class UpdateOperation implements IOperation {
    @Override
    public void work(SClass sClass) {
        System.out.println("更新学生的信息");
    }
}
