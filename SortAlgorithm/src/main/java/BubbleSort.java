import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description: 冒泡排序以及优化
 * User: liaoyueyue
 * Date: 2023-11-18
 * Time: 21:11
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 2, 4, 6, 3};
        System.out.println(Arrays.toString(bubbleSortThree(nums)));
    }

    /**
     * 基本冒泡排序
     * @param nums 需要排序的整型数组
     * @return 排序后的整型数组
     */
    public static int[] bubbleSortOne(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * 第一次优化（减少循环比较趟数）
     * 增加一个标记（flag），每次发生交换，就进行标记，如果某次循环完没有标记，则说明已经完成排序，数组有序，剩下的几趟排序就不需要再去执行了，可以提前结束排序。
     * @param nums 需要排序的整型数组
     * @return 排序后的整型数组
     */
    public static int[] bubbleSortTwo(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            // 优化冒泡排序，增加判断位，有序标记，每一轮的初始是true
            boolean flag = true;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    // 有元素交换，所以不是有序，标记变为false
                    flag = false;
                }
            }
            // 说明上面内层for循环中，没有交换任何元素，直接跳出外层循环
            if (flag) {
                break;
            }
        }
        return nums;
    }

    /**
     * 第二次优化（减少每趟循环次数）
     * 从第一次优化后的结果可以看出，在每趟排序中，右面的许多元素已经是有序的结果了，可算法还是进行后面数值的排序，因此进行第二次优化：
     * @param nums 需要排序的整型数组
     * @return 排序后的整型数组
     */
    public static int[] bubbleSortThree(int[] nums) {
        // 定义 arrBoundary 是无序数组的边界，每次比较比到这里为止，不需要进行后面的排序了。
        // 最后一次交换的下标
        int lastSwapIndex = 0;
        // 无序数组的边界，每次比较比到这里为止
        int arrBoundary = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            // 优化冒泡排序，增加判断位，有序标记，每一轮的初始是true
            boolean flag = true;
            for (int j = 1; j < arrBoundary; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    // 有元素交换，所以不是有序，标记变为false
                    flag = false;
                    // 最后一次交换元素的位置
                    lastSwapIndex = j;
                }
            }
            // 把最后一次交换元素的位置赋值给无序数组的边界
            arrBoundary = lastSwapIndex;
            // 说明上面内层for循环中，没有交换任何元素，直接跳出外层循环
            if (flag) {
                break;
            }
        }
        return nums;
    }
}
