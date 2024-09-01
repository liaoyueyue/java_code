/**
 * Created with IntelliJ IDEA.
 * Description: 二进制求和 https://leetcode.cn/problems/add-binary/description/?envType=study-plan-v2&envId=top-interview-150
 * User: liaoyueyue
 * Date: 2024-09-01
 * Time: 22:18
 */
public class AddBinary {
    /**
     * 给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和
     * <p>
     * 示例 1：
     * 输入:a = "11", b = "1"
     * 输出："100"
     * <p>
     * 示例 2：
     * 输入：a = "1010", b = "1011"
     * 输出："10101"
     * <p>
     * 提示：
     * 1 <= a.length, b.length <= 104
     * a 和 b 仅由字符 '0' 或 '1' 组成
     * 字符串如果不是 "0" ，就不含前导零
     */
    public String addBinary(String a, String b) {
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
}
