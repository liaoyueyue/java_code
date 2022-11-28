package StudentScoreManageSystem.operation;

import StudentScoreManageSystem.student.SClass;

public class SaveOperation implements IOperation{
    @Override
    public void work(SClass sClass) {
        System.out.println("保存文件");
    }
}
