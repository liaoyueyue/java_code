/**
 * Created with IntelliJ IDEA.
 * Description:合并数组并排序
 * User: liaoyueyue
 * Date: 2022-07-14
 * Time: 21:46
 */
public class homeWork2 {
    public static void BubbleSort(int a[], int num){
        for(int i = 0; i < num -1; i++){
            int flag = -1;
            for(int j = 0; j < num - i - 1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == -1){
                break;
            }
        }
    }

    public static void merge(int A[], int m, int B[], int n) {
        for(int i = 0; i < n; i++){
            A[m] = B[i];
            m++;
        }
        BubbleSort(A, 6);
        for(int i = 0; i < m+n; i++){
            System.out.print(A[i]);
        }
    }

    public static void main(String[] args) {
        int [] A = new int[6];
        A[0] = 1;
        A[1] = 3;
        A[2] = 5;
        int [] B = {2, 4, 6};
        merge(A, 3, B, 3);
        for (int i = 0; i < 6; i++) {
            System.out.print(A[i]);
        }
    }
}
