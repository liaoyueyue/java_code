import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
 * User: liaoyueyue
 * Date: 2022-05-07
 * Time: 11:39
 */
public class CopyArray {
    /**
     * 这里创建一个新的数组进行拷贝
     * @function copy1
     */
    public static void copy1(int [] array){
        int [] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        System.out.println(Arrays.toString(copy));
    }
    /**
     * 这里利用copyof函数来拷贝
     * @function copy2
     */
    public static void copy2(int [] array){
        int [] copy = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(copy));
    }
    /**
     * 这里把原数组进行克隆
     * @function copy3
     */
    public static void copy3(int [] array){
        int [] copy = array.clone();
        System.out.println(Arrays.toString(copy));
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        copy1(array);
        copy2(array);
        copy3(array);
    }
}
