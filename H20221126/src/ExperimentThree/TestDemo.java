package ExperimentThree;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-11-26
 * Time: 18:08
 */
public class TestDemo {
        private int x,y;

        public TestDemo(int a,int b) {
            x=a;
            y=b;
        }
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }

    public static void main(String args[]) {
        TestDemo loc = new TestDemo(12, 20);
        System.out.println(loc.getX());
        System.out.println(loc.getY());
    }

}
