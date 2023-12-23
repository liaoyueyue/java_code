import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 合并两个有序的数组
 * User: liaoyueyue
 * Date: 2023-12-23
 * Time: 22:48
 */
public class Test2 {
    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (A[i] < B[j]) {
                A[k--] = B[j--];
            } else {
                A[k--] = A[i--];
            }
        }
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[5];
        merge(arr1, 5, arr2, 5);
        System.out.println(Arrays.toString(arr1));
    }
}
