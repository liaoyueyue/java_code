/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-11-26
 * Time: 21:56
 */

class Student{
    int sNo;
    String sName;
    String sSex;
    int sAge;
    double sJava;

    public Student(int sNo, String sName, String sSex, int sAge, double sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public int getsNo() {
        return sNo;
    }

    public String getsName() {
        return sName;
    }

    public String getsSex() {
        return sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public double getsJava() {
        return sJava;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", sName='" + sName + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sAge=" + sAge +
                ", sJava=" + sJava +
                '}';
    }
}

public class temp {
    public static void main(String[] args) {
        Student student1 = new Student(1, "张三", "男", 18, 81);
        Student student2 = new Student(2, "李四", "男", 18, 82);
        Student student3 = new Student(3, "王五", "男", 18, 83);
        Student student4 = new Student(4, "赵六", "男", 18, 84);
        Student student5 = new Student(5, "田七", "男", 18, 85);
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
        System.out.println(student4.toString());
        System.out.println(student5.toString());
        double[] sJavaScore = new double[] {student1.getsJava(), student2.getsJava(), student3.getsJava(), student4.getsJava(), student5.getsJava()};
        double avg = 0, max = 0, min = 100;
        for (int i = 0; i < sJavaScore.length; i++) {
            avg += sJavaScore[i];
            if (sJavaScore[i] > max) {
                max = sJavaScore[i];
            }
            if (sJavaScore[i] < min) {
                min = sJavaScore[i];
            }
        }
        avg /= 5;
        System.out.println("avg: "+ avg);
        System.out.println("max: "+ max);
        System.out.println("min: "+ min);
    }

}
