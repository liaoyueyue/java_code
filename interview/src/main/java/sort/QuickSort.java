package sort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 1. 选定pivot中性轴; 2. 将大于pivot放在pivot右边; 3. 将小于pivot放在pivot左边; 4. 分别对左右子序列重复前三步操作。
 * User: liaoyueyue
 * Date: 2024-06-25
 * Time: 16:25
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("排序前序列：" + Arrays.toString(arr));
        quickSort1(arr, 0, arr.length - 1);
        System.out.println("排序后序列：" + Arrays.toString(arr));
    }

    public static void quickSort1(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left, r = right;
        int pivot = arr[left];

        while (l < r) {
            while (l < r && arr[r] >= pivot) {
                r--;
            }
            if (l < r) {
                arr[l] = arr[r];
            }
            while (l < r && arr[l] <= pivot) {
                l++;
            }
            if (l < r) {
                arr[r] = arr[l];
            }
            if (l >= r) {
                arr[l] = pivot;
            }
        }
        quickSort1(arr, left, r - 1);
        quickSort1(arr, r + 1, right);
    }

    public static void quickSort2(int[] arr, int left, int right) {
        // 左右比较值下标
        int l = left, r = right;
        // 基准位置是中值
        int pivotIndex = left + (right - left) / 2;
        // 基准值
        int pivot = arr[pivotIndex];
        // 下标l小于r
        while (l < r) {
            // 当基准值大于左边的值，左比较值需要后移，找到一个大于等于基准值的左比较值
            while (pivot > arr[l]) {
                l++;
            }
            // 当基准值小于右边的值，右比较值需要前移，找到一个小于等于基准值的右比较值
            while (pivot < arr[r]) {
                r--;
            }
            // 如果 l >= r，表示当前区间比较完毕。
            if (l >= r) {
                break;
            }
            // 交换左右比较值
            swap(arr, l, r);
            // 如果交换后，左比较值等于基准值，说明基准值一定小于等于右比较值，右比较值前移
            if (arr[l] == pivot) {
                r--;
            }
            // 如果交换后，右比较值等于基准值，说明基准值一定大于等于左比较值，左比较值前移
            if (arr[r] == pivot) {
                l++;
            }
        }
        // 如果l等于r，l后移，r前移。不写会出现栈溢出。
        if (l == r) {
            l++;
            r--;
        }
        // 如果左边界值小于r，就递归排序左边界到r的值
        if (left < r) {
            quickSort2(arr, left, r);
        }
        // 如果右边界值大于l，就递归排序l到右边界的值
        if (right > l) {
            quickSort2(arr, l, right);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
