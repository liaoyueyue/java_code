import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 检查字符串内字符重复
 * User: liaoyueyue
 * Date: 2023-12-23
 * Time: 22:32
 */
public class Test1 {
    public static String func(String s) {
        int[] arr = new int[255];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (arr[ch] == 0) {
                stringBuilder.append(ch);
                arr[ch] = 1;
            }
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s  = scanner.nextLine();
            System.out.println("func(s) = " + func(s));
        }
    }
}
