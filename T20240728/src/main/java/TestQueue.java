import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * Description: 队列是一种先进先出（FIFO）的数据结构，常用于任务调度、广度优先搜索等。Java提供了Queue接口，以及LinkedList和ArrayDeque等实现
 * User: liaoyueyue
 * Date: 2024-08-25
 * Time: 2:23
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        String a = queue.poll();
    }
}
