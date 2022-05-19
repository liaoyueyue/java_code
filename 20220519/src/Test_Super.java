/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-05-19
 * Time: 22:12
 */


/**
 * super关键字，该关键字主要作用：在子类方法中访问父类的成员。
 */

class Base2{
    int a = 1;
    int b = 2;
    int c = 3;
    public void mothodA(){
        System.out.println("Base.mothodA");
    }
}

class Derive2 extends Base2{
    int a = 1111;
    int b = 2222;

    public void mothodA(int a)//重载
    {
        System.out.println("Derive.mothodA");
    }
    public void mothodB(){
        super.a = 1111;//在子类中访问父类的元素
        super.b = 2222;
        this.a = super.a;//这里把父类a的值给子类的a
        System.out.println("Derive.mothodB");
    }


}

public class Test_Super {
    public static void main(String[] args) {

    }
}
