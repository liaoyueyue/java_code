import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * Description: Set接口表示一组不允许重复元素的数据结构。常见的Set实现包括HashSet和TreeSet。
 * User: liaoyueyue
 * Date: 2024-07-28
 * Time: 17:20
 */
public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.remove(3);
        System.out.println(Arrays.toString(set.toArray()));
    }
}
