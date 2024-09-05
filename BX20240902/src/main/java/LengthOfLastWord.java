/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-09-02
 * Time: 21:41
 */
public class LengthOfLastWord {
    public int lengthOfLastWord1(String s) {
        String trimStr = s.trim();
        String lastWord = trimStr.substring(trimStr.lastIndexOf(' ') + 1);
        return lastWord.length();
    }

    public int lengthOfLastWord2(String s) {
        return s.split(" ")[s.split(" ").length - 1].length();
    }

    public int lengthOfLastWord3(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (count == 0) {
                    continue;
                }
                break;
            }
            count++;
        }
        return count;
    }
}
