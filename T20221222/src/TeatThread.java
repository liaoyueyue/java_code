/**
 * Created with IntelliJ IDEA.
 * Description:创建Tread的各种方法以及一些应用
 * User: liaoyueyue
 * Date: 2022-12-22
 * Time: 9:22
 */
public class TeatThread {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println("采用匿名内部内创建Tread子类对象");
            }
        };

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("采用匿名内部内创建Runnable子类对象");
            }
        });

        Thread t3 = new Thread(() -> System.out.println("采用lambda表达式创建Runnable子类对象"));
        Thread t4 = new Thread(() -> {
            System.out.println("采用lambda表达式创建Runnable子类对象");
        });

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });
        t.start();
        System.out.println("2");
    }
}
