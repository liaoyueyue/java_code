import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-09
 * Time: 17:41
 */
public class Main2 {
    public ArrayList<Integer> intersection(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        ArrayList<Integer> newNums = new ArrayList<>();
        for (Integer num : nums1) {
            hashmap.put(num, 1);
        }
        for (Integer num : nums2) {
            if (hashmap.containsKey(num) && hashmap.get(num) < 2) {
                newNums.add(num);
                hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
            }
        }
        return newNums;
    }
}
