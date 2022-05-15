/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-13
 * Time: 13:26
 */
/*
class Base{

    public Base(String s){

        System.out.print("B");

    }

    Base() {
    }
}

public class Test extends Base{

    public Test (String s) {

        System.out.print("D");

    }

    public static void main(String[] args){

        new Test("C");

    }

}*/

class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
public class Z extends X{
    Y y=new Y();
    public Z(){
        System.out.print("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}


