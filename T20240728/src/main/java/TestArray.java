import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: Java中的数组是一种基本的数据结构，用于存储一组相同类型的元素。数组的长度在创建时固定，因此在后续操作中不能更改。
 * User: liaoyueyue
 * Date: 2024-07-28
 * Time: 16:55
 */
public class TestArray {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 0;
        intArray[1] = 1;
        intArray[2] = 2;
        intArray[3] = 3;
        intArray[4] = 4;
        System.out.println(Arrays.toString(intArray));
    }
}
