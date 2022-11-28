package ExperimentThree;

/**
 * Created with IntelliJ IDEA.
 * Description:练习类的继承
 * User: 严显鹏
 * class: 21软工本1
 * Date: 2022-11-20
 */

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Student extends Person{
    private int classId;
    private double score;

    public Student(int id, String name, int classId, double score) {
        super(id, name);
        this.classId = classId;
        this.score = score;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }



}

class Teacher extends Person{
    private String title;
    private String department;

    public Teacher(int id, String name, String title, String department) {
        super(id, name);
        this.title = title;
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}


public class StudentManagementSystem {
    public static void main(String[] args) {

    }
}
