/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-09-01
 * Time: 0:29
 */
public class Test1 {
    public String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n = Math.max(a.length(), b.length()), carry = 0;

        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            carry += i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            sb.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            sb.append('1');
        }

        return sb.reverse().toString();
    }
}
