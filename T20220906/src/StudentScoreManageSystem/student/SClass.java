package StudentScoreManageSystem.student;

public class SClass {
    //最多可以放40个学生信息
    private Student[] students = new Student[50];

    private int userSize; //用来记录实时学生个数

    public SClass() {
        students[0] = new Student("2350210101", "张三", 18, 97.8, 78.6, 78.7);
        students[1] = new Student("2350210101", "李四", 15, 67.8, 67.8, 98.3);
        students[2] = new Student("2350210101", "王五", 16, 87.3, 72.4, 88.5);
        students[3] = new Student("2350210101", "周六", 17, 65.8, 67.6, 68.5);
        userSize = 4;
    }

    /**
     *这里获取学生的信息
     */
    public Student getStudent(int pos) {
        return students[pos];
    }

    /**
     * 这里是修改学生的信息
     */

    public void setStudent(int pos, Student student) {
        students[pos] = student;
    }

    /**
     *这里获取实时班上同学的个数
     */

    public int getUserSize() {
        return userSize;
    }

    /**
     *这里修改实时班上同学的个数
     */

    public void setUserSize(int size) {
        userSize = size;
    }
}
