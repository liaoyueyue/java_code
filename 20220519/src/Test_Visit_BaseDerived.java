/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-19
 * Time: 21:54
 */

 class Base{
    int a = 1;
    public void mothodA(){
        System.out.println("Base:othod");
    }
}
class Derive extends Base{
    int b = 2;
    char a = 1;//如果重新定义a则在该类中会优先访问自己的
    public void mothodB(){
        System.out.println("Derive:monthod");
    }

    public void mothodC(){
        a = 1111; //访问从父类中继承下来的a
        mothodA();
        mothodB();
        mothodC();
    }
}

public class Test_Visit_BaseDerived {
    public static void main(String[] args) {

    }
}
/**
 * 通过子类对象访问父类与子类中不同名方法时，优先在子类中找，找到则访问，否则在父类中找，找到
 * 则访问，否则编译报错。
 * 通过派生类对象访问父类与子类同名方法时，如果父类和子类同名方法的参数列表不同(重载)，根据调用
 * 方法适传递的参数选择合适的方法访问，如果没有则报错；
 */
