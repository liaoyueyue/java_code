package StudentScoreManageSystem.user;

import StudentScoreManageSystem.operation.IOperation;
import StudentScoreManageSystem.student.SClass;

public abstract class User {
    public int menu;
    protected String name;//用户名
    protected IOperation[] iOperations;//这里是可选择的功能的表，此时没有初始化和分配大小

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, SClass sClass) {
        this.iOperations[choice].work(sClass);
    }
}
