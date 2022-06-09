/**
 * Created with IntelliJ IDEA.
 * Description:foreach的练习
 * User: liaoyueyue
 * Date: 2022-06-09
 * Time: 10:05
 */
public class Test_1 {
    public static void main(String[] args) {
        int [][] arr = new int[][]{{1, 2, 3, 4},{5,6}};
        for (int [] i:
                arr) {
            for (int j:
                 i) {
                System.out.print(j);
            }

        }
    }

}
