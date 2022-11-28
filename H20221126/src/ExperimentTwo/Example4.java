package ExperimentTwo;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:随机产生20个50~100间的整数，输出这20个数并找出最大数及最小数输出。
 * User: liaoyueyue
 * Date: 2022-11-26
 * Time: 14:04
 */
public class Example4 {
    public static final int N = 20;

    public static void main(String[] args) {
        int[] array = new int[N];
        Random random = new Random(System.currentTimeMillis()); //默认当前系统时间的毫秒数作为种子数
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 50; //这里的区间是[50, 100)
        }
        System.out.println("20个随机整数为：" + Arrays.toString(array));
        Example3.quickSort(array, 0, array.length - 1);  //进行排序
        System.out.println("最大值："+ array[array.length-1]);
        System.out.println("最小值："+ array[0]);
    }
}