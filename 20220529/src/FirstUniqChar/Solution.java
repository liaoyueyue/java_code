package FirstUniqChar;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 * Tip:  1 <= s.length <= 105, s 只包含小写字母
 * User: liaoyueyue
 * Date: 2022-05-29
 * Time: 14:20
 */

public class Solution {
    static int firstUniqChar(String s) {
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(hash[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入只能是小写字符");
        String string = in.nextLine();
        int ret = firstUniqChar(string);
        System.out.println(ret);

    }
}
