import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *              合并两个有序的数组
 *              给出一个有序的整数数组 A 和有序的整数数组 B ，请将数组 B 合并到数组 A 中，变成一个有序的升序数组
 *              链接：https://www.nowcoder.com/questionTerminal/89865d4375634fc484f3a24b7fe65665
 *              来源：牛客网
 * User: liaoyueyue
 * Date: 2022-07-14
 * Time: 21:46
 */

public class MergeArray {
    public void merge(int A[], int m, int B[], int n) {
        int i = m -1;
        int j = n -1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(A[i] > B[j]){
                A[k--] = A[i--];
            }else{
                A[k--] = B[j--];
            }
        }
        while(i >= 0){
            A[k--] = A[i--];
        }
        while(j >= 0){
            A[k--] = B[j--];
        }
    }

    public static void main(String[] args) {
        int[] a = new int[8];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;
        a[3] = 7;
        int[] b = {2, 4, 6, 8};
        MergeArray mergeArray = new MergeArray();
        mergeArray.merge(a, 4, b, 4);
        System.out.println("a:"+ Arrays.toString(a));
        System.out.println("b:"+ Arrays.toString(b));
    }
}