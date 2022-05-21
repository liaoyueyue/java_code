/**
 * Created with IntelliJ IDEA.
 * Description:这里用来测试重写和重载的区别
 * User: liaoyueyue
 * Date: 2022-05-21
 * Time: 13:06
 */
class Base{
    public void print(){
        System.out.println("Base.print");
    }
    public void print(String string){//这里是print重载
        System.out.println(string);
    }
}
class Derivative extends Base{
    @Override
    public void print() {//这里重写父类的print的函数
        System.out.println("Derivative.print");
    }
}

public class Test_OverrideOverload {
    public static void main(String[] args) {
        Base base = new Base();
        base.print("Hello World");
    }

}
/**
 * 区别点 重载(override) 重写(override)
 * 参数列表 必须修改 一定不能修改
 * 返回类型 可以修改 一定不能修改
 * 访问限定符 可以修改 一定不能做更严格的限制（可以降低限制）
 */
