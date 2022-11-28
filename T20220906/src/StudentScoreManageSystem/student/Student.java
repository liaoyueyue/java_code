package StudentScoreManageSystem.student;

public class Student {
    private String stuId;//学生的学号
    private String stuName;//学生的姓名
    private  int stuAge;//学生的年龄
    private double mathScore;//数学成绩
    private double physicsScore;//物理成绩
    private double englishScore;//英语成绩

    public Student(String stuId, String stuName, int stuAge, double mathScore, double physicsScore, double englishScore) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.englishScore = englishScore;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", mathScore=" + mathScore +
                ", physicsScore=" + physicsScore +
                ", englishScore=" + englishScore +
                '}';
    }
}
