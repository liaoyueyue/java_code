import java.util.Locale;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * Tip: 1 <= s.length <= 2 * 105, 字符串 s 由 ASCII 字符组成
 * User: liaoyueyue
 * Date: 2022-05-29
 * Time: 21:06
 */
public class VerificationPalindromeString {
    public static boolean isValidChar(char ch) {
        if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();//先统一字母为小写
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            //先判断左边是否是有效字符，若不是则跳过
            while (!isValidChar(s.charAt(left)) && left < right) {
                left++;
            }
            //右边同理
            while (!isValidChar(s.charAt(right)) && left < right) {
                right--;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            System.out.println(isPalindrome(in.nextLine()));
        }
    }
}
