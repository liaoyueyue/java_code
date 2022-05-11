/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-11
 * Time: 14:35
 */
/*class Test {
    public static void hello() {
        System.out.println("hello");
    }
}*/
/*
public class TestDemo {
    public static void main(String[] args) {
*/
/*        // TODO Auto-generated method stub
        Test test = null;
        test.hello();*//*

*/
/*        String s;

        System.out.println("s="+s);*//*

    }
}*/

/*
public class TestDemo {
    public int aMethod(){
        static int i = 0;
        i++;
        return i;
    }
    public static void main(String args[]){
        TestDemo test = new TestDemo();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}
*/

/*
 class Person{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Person";

    int age=0;

}

public class TestDomo{

    public String grade;

    public static void main(String[] args){

        Person p = new Person() ;

        System.out.println(p.age());

    }

}*/

/*
public class TestDemo{

    private int count;

    public static void main(String[] args) {

        TestDemo test=new TestDemo(88);

        System.out.println(test.count);

    }

    TestDemo(int a) {

        count=a;

    }

}*/

/*
public class TestDemo{
    static int cnt = 6;
    static{
        cnt += 9;
    }
    public static void main(String[] args){
        System.out.println("cnt="  + cnt);
    }
    static{
        cnt /=3;
    }
}*/

public class Test {

    private float f=1.0f;

    int m=12;

    static int n=1;

    public static void main(String args[]){

        Test t = new Test();
        System.out.println(Test.n);

    }

}