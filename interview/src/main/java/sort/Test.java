package sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-06-26
 * Time: 15:04
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("排序前序列：" + Arrays.toString(arr));
        System.out.println("BubbleSort.bubbleSort(arr)");
        BubbleSort.bubbleSort(arr);
        System.out.println("排序后序列：" + Arrays.toString(arr));
    }
}
