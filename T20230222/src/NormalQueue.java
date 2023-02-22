/**
 * Created with IntelliJ IDEA.
 * Description:普通队列的实现数组
 * User: liaoyueyue
 * Date: 2023-02-22
 * Time: 20:08
 */
public class NormalQueue {
    private int[] items = new int[1000];
    private volatile int head = 0;
    private volatile int tail = 0;
    private volatile int size = 0;

    //入队列方法
    public void put(int elem) {
        synchronized (this) {
            //判断队列是否满了
            if (size >= items.length) {
                return;
            }
            items[tail] = elem;
            tail++;
            //因循环队列到最后后下标应回0
            if (tail >= items.length) {
                tail = 0;
            }
            // tail = tail % items.length;
            size++;
        }
    }

    //出队列方法,返回出队列的元素
    public Integer take() {
        synchronized (this) {
            //判断队列是否为空
            if (size == 0) {
                return null;
            }
            int ret = items[head];
            head++;
            if (head >= items.length) {
                head = 0;
            }
            size--;
            return ret;
        }
    }
}
