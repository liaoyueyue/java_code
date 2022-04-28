import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-28
 * Time: 20:41
 */
public class TestPrintArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.printf("\n");
        for (int x:
             array) {
            System.out.print(x+" ");
        }
        System.out.println("\n"+Arrays.toString(array));
    }
}
