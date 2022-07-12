import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 实现函数 int sqrt(int x).
 * 计算并返回 x 的平方根（向下取整）
 * 数据范围： 0 <= x < 2^31-1
 * 要求：空间复杂度 O(1),时间复杂度 O(logx)
 * User: liaoyueyue
 * Date: 2022-07-11
 * Time: 14:48
 */

class Solution {
    /**
     * @param x int整型
     * @return int整型
     */
    //根据平方数的性质——连续n个奇数相加的结果一定是平方数。
    public int sqrt1(int x) {
        int i = 1;
        int res = 0;
        while (x >= 0) {
            x -= i;
            res++;
            i += 2;
        }
        return res - 1;
    }
}

public class HomeWork {
    public static void main(String[] args){
        Solution soluton = new Solution();
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个整形的平方数可求该数");
        int num = soluton.sqrt1(in.nextInt());
        System.out.println(num);
    }

}
