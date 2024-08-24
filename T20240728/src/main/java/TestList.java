import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: Java中的List接口是一种有序的数据结构，允许元素的重复。常见的List实现包括ArrayList和LinkedList。
 * User: liaoyueyue
 * Date: 2024-07-28
 * Time: 17:04
 */
public class TestList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Arrays.toString(list.toArray());
    }
}
