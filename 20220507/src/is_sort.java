/**
 * Created with IntelliJ IDEA.
 * Description:给定一个整型数组, 判定数组是否有序（递增）
 * User: liaoyueyue
 * Date: 2022-05-07
 * Time: 10:52
 */
public class is_sort {
    public static Boolean IsSort(int [] array){
        Boolean flag = false;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] > array[i+1]){
                return flag;
            }
        }
        flag = true;
        return flag;
    }
    public static void main(String[] args) {
        int [] array1 = {3, 4, 5, 2, 4};
        int [] array2 = {1, 2, 3, 4, 5};
        System.out.println("array1是否有序递增："+IsSort(array1));
        System.out.println("array2是否有序递增："+IsSort(array2));
    }
}
