/**
 * Created with IntelliJ IDEA.
 * Description: 验证回文串 https://leetcode.cn/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
 * User: liaoyueyue
 * Date: 2024-09-13
 * Time: 2:35
 */
public class ValidPalindrome {
    /**
     * 如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
     * 字母和数字都属于字母数字字符。
     * 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
     * <p>
     * 示例 1：
     * 输入: s = "A man, a plan, a canal: Panama"
     * 输出：true
     * 解释："amanaplanacanalpanama" 是回文串。
     * <p>
     * 示例 2：
     * 输入：s = "race a car"
     * 输出：false
     * 解释："raceacar" 不是回文串。
     * <p>
     * 示例 3：
     * 输入：s = " "
     * 输出：true
     * 解释：在移除非字母数字字符之后，s 是一个空字符串 "" 。
     * 由于空字符串正着反着读都一样，所以是回文串。
     */
    public boolean isPalindrome1(String s) {
        StringBuffer sgood = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgoodRev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgoodRev.toString());
    }

    public boolean isPalindrome2(String s) {
        StringBuffer sgood = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        int left = 0, right = sgood.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(sgood.charAt(left)) != Character.toLowerCase(sgood.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome3(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
