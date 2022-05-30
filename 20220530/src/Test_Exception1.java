/**
 * Created with IntelliJ IDEA.
 * Description:这里练习异常的用法
 * User: liaoyueyue
 * Date: 2022-05-30
 * Time: 19:51
 */
public class Test_Exception1 {

    public static int getEilement(int[] array, int index) {
        if (array == null) {
            throw new NullPointerException("传入为数组为null");
        }
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("数组越界访问");
        }
        return array[index];
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(getEilement(array,3));//此处为数组的越界访问
    }
}
/**
 * 1. throw必须写在方法体内部
 * 2. 抛出的对象必须是Exception 或者 Exception 的子类对象
 * 3. 如果抛出的是 RunTimeException 或者 RunTimeException 的子类，则可以不用处理，直接交给JVM来处理
 * 4. 如果抛出的是编译时异常，用户必须处理，否则无法通过编译
 * 5. 异常一旦抛出，其后的代码就不会执行
 */
