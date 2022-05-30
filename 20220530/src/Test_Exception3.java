/**
 * Created with IntelliJ IDEA.
 * Description:这里练习throws(声明异常)
 * User: liaoyueyue
 * Date: 2022-05-30
 * Time: 20:52
 */
public class Test_Exception3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("张三", 18);
        Person person2 = (Person) person1.clone();
    }
}

/**
 *  处在方法声明时参数列表之后，当方法中抛出编译时异常，用户不想处理该异常，此时就可以借助throws将异常抛
 *  给方法的调用者来处理。即当前方法不处理异常，提醒方法的调用者处理异常。
 * 1. throws必须跟在方法的参数列表之后
 * 2. 声明的异常必须是 Exception 或者 Exception 的子类
 * 3. 方法内部如果抛出了多个异常，throws之后必须跟多个异常类型，之间用逗号隔开，如果抛出多个异常类型
 *    具有父子关系，直接声明父类即可。
 */
