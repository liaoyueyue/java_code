package ExperimentTwo;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:产生10个100之内的随机整数输出，并把这10个数按从小到大的顺序输出。
 * User: liaoyueyue
 * Date: 2022-11-26
 * Time: 14:04
 */
public class Example3 {
    public static final int N = 10;

    public static void main(String[] args) {
        int[] array = new int[N];
        Random random = new Random(System.currentTimeMillis()); //默认当前系统时间的毫秒数作为种子数
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); //这里的区间是[0, 100)
        }
        System.out.println("排序前：" + Arrays.toString(array));
        quickSort(array, 0, array.length-1);  //进行排序
        System.out.println("排序后：" + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int L, int R) {
        if (L >= R) {
            return;
        }
        int left = L, right = R;
        int pivot = array[left];
        while (left < right) {
            while (left < right && array[right] >= pivot) {
                right--;
            }
            if (left < right) {
                array[left] = array[right];
            }
            while (left < right && array[left] <= pivot) {
                left++;
            }
            if (left < right) {
                array[right] = array[left];
            }
            if (left >= right) {
                array[left] = pivot;
            }
        }
        quickSort(array, L, right);
        quickSort(array, right+1, R);
    }
}
