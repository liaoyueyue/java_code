import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * Description: 堆栈是一种后进先出（LIFO）的数据结构，常用于实现撤销操作、表达式求值等。Java提供了java.util.Stack类，但通常建议使用Deque接口的ArrayDeque来模拟堆栈操作
 * User: liaoyueyue
 * Date: 2024-08-25
 * Time: 2:14
 */
public class TestStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }
}
