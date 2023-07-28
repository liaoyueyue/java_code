import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-07-28
 * Time: 15:40
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 1;//假如序列已经有序
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 0;
                }
            }
            if (flag == 1) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
