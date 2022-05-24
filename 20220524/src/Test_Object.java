import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-24
 * Time: 20:14
 */

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person{
    String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        Student student = (Student) o;
        if(student instanceof Student){
            if (this.id.equals( ((Student) o).id)) return true;//这里调用String的equals函数来比较两个字符串的长度
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class Test_Object {
    public static void func(Object object){
        System.out.println(object);
    }

    public static void main(String[] args) {
        System.out.println("测试打印类的tostring方法");
        func(new Person("张三", 18));
        func(new Student("李华", 17, "88"));
        System.out.println("下面测试equals");
        Student student1 = new Student("小明", 18, "88");
        Student student2 = new Student("小美", 18, "77");
        if (student1.equals(student2)) {//这里判断id是否相等
            System.out.println("id相等");
        }else{
            System.out.println("id不相等");
        }
        System.out.println("下面测试hashcode的用途");
        Person person1 = new Person("张三", 23);
        Person person2 = new Person("李四", 24);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}


/**
 * Object是Java默认提供的一个类。Java里面除了Object类，所有的类都是存在继承关系的。
 * 默认会继承Object父类。即所有类的对象都可以使用Object的引用进行接收。
 * 比较对象中内容是否相同的时候，一定要重写equals方法。
 * hashcode方法用来确定对象在内存中存储的位置是否相同
 */