import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个有序整型数组, 实现二分查找
 * User: liaoyueyue
 * Date: 2022-05-07
 * Time: 11:17
 */
public class my_binary_search {
    public static int BinarySearch(int [] array, int key){
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(array[mid] < key){
                left = mid+1;
            }else if(array[mid] > key){
                right = mid -1;
            }else{
                return mid;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入查找的数：");
        int num = in.nextInt();
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("下标为"+BinarySearch(array, num));
    }

}
