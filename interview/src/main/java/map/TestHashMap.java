package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-11
 * Time: 20:47
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
