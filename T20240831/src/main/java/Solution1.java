import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * Description: 二进制求和 https://leetcode.cn/problems/add-binary/description/?envType=study-plan-v2&envId=top-interview-150
 * User: liaoyueyue
 * Date: 2024-08-31
 * Time: 22:56
 */
public class Solution1 {
    public static void main(String[] args) {

    }

    public String addBinary1(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int n = Math.max(a.length(), b.length()), carry = 0;

        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            sb.append((char)(carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }

    public String addBinary2(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }

    public String addBinary3(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();
        //循环相加两个字符串相同长度的低位数部分
        while (i >= 0 && j >= 0) {
            int sum = carry;
            sum += a.charAt(i--) - '0';
            sum += b.charAt(j--) - '0';
            carry = sum / 2;
            builder.append(sum % 2);
        }
        // 如果 a 还没遍历完成（a串比b串长），则继续遍历添加 a 的剩余部分
        while (i >= 0) {
            int sum = carry + a.charAt(i--) - '0';
            carry = sum / 2;
            builder.append(sum % 2);
        }
        // 如果 b 还没遍历完成（b串比a串长），则继续遍历添加 b 的剩余部分
        while (j >= 0) {
            int sum = carry + b.charAt(j--) - '0';
            carry = sum / 2;
            builder.append(sum % 2);
        }
        //如果 carry 不等于0 还有个进位数没加进去，需要补充
        if (carry == 1) {
            builder.append(carry);
        }
        //反转字符串获得正常结果
        return builder.reverse().toString();
    }
}
