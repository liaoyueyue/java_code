/**
 * Created with IntelliJ IDEA.
     * Description:这里练习try, catch, finally。(尝试， 捕获， 最终)
 * User: liaoyueyue
 * Date: 2022-05-30
 * Time: 20:07
 */
public class Test_Exception2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            System.out.println("before");
            System.out.println(array[100]);//这里会发生越界访问
            System.out.println("after");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("越界访问");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
            e.printStackTrace();
        }
        System.out.println("after try catch code");

    }
}

/**
 * 语法格式：
 * try{
 *  // 将可能出现异常的代码放在这里
 * }catch(要捕获的异常类型 e){
 *  // 如果try中的代码抛出异常了，此处catch捕获时异常类型与try中抛出的异常类型一致时，或者是try中抛出异常的基类
 * 时，就会被捕获到
 *  // 对异常就可以正常处理，处理完成后，跳出try-catch结构，继续执行后序代码
 * }catch(异常类型 e){          //如果异常之间具有父子关系，一定是子类异常在前catch，父类异常在后catch，否则语法错误：
 *  // 对异常进行处理
 * }finally{
 *  // 此处代码一定会被执行到
 *  // 1.有些特定的代码，不论程序是否发生异常，都需要执行，比如程序中打开的资源：网络连接、数据库
 *  //   连接、IO流等，在程序正常或者异常退出时，必须要对资源进进行回收。另外，因为异常会引发程序的跳转，可能
 *  // 2.导致有些语句执行不到，finally就是用来解决这个问题的。
 *  // 3.finally中的代码一定会执行的，一般在finally中进行一些资源清理的扫尾工作
 * }
 */


/**
 * 如果向上一直传递都没有合适的方法处理异常, 最终就会交给 JVM 处理, 程序就会异常终止(和我们最开始未使用 try
 * catch 时是一样的)
 */


/**

 */