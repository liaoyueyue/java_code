import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description: 没做出来
 * User: liaoyueyue
 * Date: 2024-07-09
 * Time: 16:44
 */
public class Main3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNext()) {
            String str = in.next();
            System.out.println(func(str));
        }
    }

    public static String func(String str) {
        if(str.equals("")) {
            return "0";
        }
        if (str.length() == 2 && str.charAt(0) != str.charAt(1)) {
            return str;
        }
        String newStr = "";
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) != (str.charAt(i + 1))) {
                newStr += str.charAt(i);
            }else {
                i++;
            }
        }
        newStr += str.charAt(str.length() - 1);
        return func(newStr);
    }
}
