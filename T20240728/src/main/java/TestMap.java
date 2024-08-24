import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description: Map接口表示一组键-值对的数据结构。常见的Map实现包括HashMap和TreeMap。
 * User: liaoyueyue
 * Date: 2024-07-28
 * Time: 17:33
 */
public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.remove("C");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        map.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
    }
}
