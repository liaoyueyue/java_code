import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Problem:产生10个100之内的随机整数输出，并把这10个数按从小到大的顺序输出。
 * Name: 严显鹏
 * Class: 21软工本1
 * Date: 2022-10-30
 */
public class RandomNumSort {

        public static void bubbleSort(int [] arr) {
            if (arr == null) {
                System.out.println("数组为空");
                return;
            }
            for (int i = 0; i < arr.length; i++) {
                boolean flag = false;//flag判断是否已经有序
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        flag = true;
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                if (!flag) {
                    break;
                }
            }
        }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("生成的数为：");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));
    }
}
