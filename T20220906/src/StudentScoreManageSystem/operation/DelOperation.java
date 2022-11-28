package StudentScoreManageSystem.operation;

import StudentScoreManageSystem.student.SClass;

public class DelOperation implements IOperation {
    @Override
    public void work(SClass sClass) {
        System.out.println("删除学生信息");
    }
}
