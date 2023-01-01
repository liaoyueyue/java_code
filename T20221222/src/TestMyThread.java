/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-12-23
 * Time: 11:05
 */

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("[MyThread]这里是线程运行的代码");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("[MyRunnable]这里是线程运行的代码");
    }
}

public class TestMyThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
        System.out.println("这里是主函数的代码");
    }
}
