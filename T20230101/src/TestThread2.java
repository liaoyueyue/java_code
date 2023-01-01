/**
 * Created with IntelliJ IDEA.
 * Description:通过实现Runnable接口，重写run方法来创建线程
 * User: liaoyueyue
 * Date: 2023-01-01
 * Time: 22:33
 */


class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("通过实现Runnable接口，重写run方法来创建线程");
    }
}

public class TestThread2 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
