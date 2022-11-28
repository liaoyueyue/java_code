/**
 * Created with IntelliJ IDEA.
 * Description:
                 * 罗马数字转整数
                 * 罗马数字包含以下七种字符: I ， V ， X ， L ， C ， D 和 M 。
                 * 字符 数值 I 1 V 5 X 10 L 50 C 100 D 500 M 1000
                 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做 XXVII, 即为 XX + V + II 。
                 *
                 * 来源：力扣（LeetCode）
                 * 链接：https://leetcode.cn/problems/roman-to-integer
                 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * User: liaoyueyue
 * Date: 2022-09-04
 * Time: 10:55
 */
public class IsHappy {

    public boolean isHappy(int n) {
        int N = n;

        while(N % 10 != 0){
            int sum = 0;
            int num = N % 10;
            while(num > 0){
                sum += num*num;
                N /= 10;
                num = N % 10;
            }
            if(sum == 1){
                return true;
            }
            N = sum;
        }
        return true;
    }

    public static void main(String[] args) {
        IsHappy isHappy = new IsHappy();
        int n = 3;
        System.out.println(isHappy.isHappy(n));
    }

}
