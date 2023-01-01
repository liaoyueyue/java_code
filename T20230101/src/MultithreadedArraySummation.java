/**
 * Created with IntelliJ IDEA.
 * Description:多线程数组求和
 * User: liaoyueyue
 * Date: 2023-01-01
 * Time: 23:01
 */

import java.util.Random;

/**
 * 1给定一个很长的数组 (长度 1000w), 通过随机数的方式生成 1-100 之间的整数.
 * 2实现代码, 能够创建两个线程, 对这个数组的所有元素求和.
 * 3其中线程1 计算偶数下标元素的和, 线程2 计算奇数下标元素的和.
 * 4最终再汇总两个和, 进行相加
 * 5记录程序的执行时间.
 */

public class MultithreadedArraySummation {
    static int evenSum = 0;
    static int oddSum = 0;

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int[] arr = new int[1000_0000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;//[0+1, 100+1)
        }

        Thread t1 = new Thread(() ->{
            for (int i = 0; i < arr.length; i += 2) {
                evenSum += arr[i];
            }
        });
        Thread t2 = new Thread(() ->{
            for (int i = 1; i < arr.length; i += 2) {
                oddSum += arr[i];
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("和为" + (evenSum + oddSum));
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start) + "ms");
    }
}
