/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-01-04
 * Time: 12:19
 */
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[20];
        for(int i=0; i<20; i++){
            final int n = i;
            threads[i] = new Thread(() -> {
                System.out.println(n);
            });
        }
        for(Thread t : threads){
            t.start();
        }
        for(Thread t : threads){
            t.join();
        }
        System.out.println("OK");
    }
}
