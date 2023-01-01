/**
 * Created with IntelliJ IDEA.
 * Description:继承Thread方法重写run方法来创建线程
 * User: liaoyueyue
 * Date: 2023-01-01
 * Time: 22:27
 */

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread方法重写run方法来创建线程");
    }
}
public class TestThread1 {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.start();
    }
}
