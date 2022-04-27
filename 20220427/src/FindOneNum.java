/**
 * Created with IntelliJ IDEA.
 * Description:有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
 * User: liaoyueyue
 * Date: 2022-04-27
 * Time: 21:18
 */
public class FindOneNum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5};
        int tmp = arr[0];
        //异或相同取0，相异取1。
        //异或特点：1、n^n=0  2、n^0=n  3、a^b^a=b
        for (int i = 1; i < arr.length; i++) {
            tmp ^= arr[i];
        }
        System.out.println(tmp);
    }
}
