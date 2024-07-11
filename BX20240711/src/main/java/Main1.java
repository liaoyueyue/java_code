import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 简写单词 https://www.nowcoder.com/questionTerminal/0cfa856bf0d649b88f6260d878f35bb4
 * User: liaoyueyue
 * Date: 2024-07-11
 * Time: 15:58
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] s = line.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length; i++) {
                sb.append(Character.toUpperCase(s[i].charAt(0)));
            }
            System.out.println(sb.toString());
        }
    }
}
