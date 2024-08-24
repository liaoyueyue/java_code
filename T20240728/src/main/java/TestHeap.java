import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-08-25
 * Time: 2:35
 */
public class TestHeap {
    public static void main(String[] args) {
        // 初始化小顶堆
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        // 元素入堆
        heap.offer(1);
        heap.offer(4);
        heap.offer(2);
        heap.offer(6);
        heap.offer(8);

        // 元素出堆（从小到大）
        heap.poll(); // -> 1
        heap.poll(); // -> 2
        heap.poll(); // -> 4
        heap.poll(); // -> 6
        heap.poll(); // -> 8
    }
}
