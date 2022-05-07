import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个整型数组, 实现冒泡排序(升序排序)
 * User: liaoyueyue
 * Date: 2022-05-07
 * Time: 10:37
 */
public class bubble_sort {
    public static void BubleSort(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {3, 6, 7, 2, 4, 5, 1, 8};
        BubleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
