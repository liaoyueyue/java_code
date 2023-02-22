/**
 * Created with IntelliJ IDEA.
 * Description:堵塞队列，队列为空则出队列堵塞；队列为满则入队列堵塞
 * User: liaoyueyue
 * Date: 2023-02-22
 * Time: 22:32
 */
public class MyBlockingQueue {
    private int[] items = new int[1000];
    private volatile int head = 0;
    private volatile int tail = 0;
    private volatile int size = 0;

    //入队列方法
    public void put(int elem) throws InterruptedException {
        synchronized (this) {
            //判断队列是否满了
            while (size >= items.length) {
                this.wait();
            }
            items[tail] = elem;
            tail++;
            //因循环队列到最后后下标应回0
            if (tail >= items.length) {
                tail = 0;
            }
            // tail = tail % items.length;
            size++;
            this.notify();
        }
    }

    //出队列方法,返回出队列的元素
    public Integer take() throws InterruptedException {
        synchronized (this) {
            //判断队列是否为空，
            while (size == 0) {
                //出队列堵塞
                this.wait();
            }
            int ret = items[head];
            head++;
            if (head >= items.length) {
                head = 0;
            }
            size--;
            this.notify();
            return ret;
        }
    }
}

