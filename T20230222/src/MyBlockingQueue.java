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

class TestDemo {
    public static void main(String[] args) {
        MyBlockingQueue myBlockingQueue = new MyBlockingQueue();
        // 当线程1采取出队列操作因队列元素为空，从而触发出队列的堵塞
        Thread t1 = new Thread(()->{
            try {
                myBlockingQueue.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // 线程2采取入队列操作并通知出队列之后解锁，后续线程1和线程3参与调度，谁先谁后不知道
        Thread t2 = new Thread(()->{
            try {
                myBlockingQueue.put(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        // 如果线程3获得调度，执行出队列操作并解锁，因为元素1入队后又出队了，最初的线程1的出队列还是检查为元素为空，
        // 堵塞时间可能比较长队列内元素不知道经历了什么，所以就需要采用while来判断队列元素的个数

        Thread t3 = new Thread(()->{
            try {
                myBlockingQueue.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
