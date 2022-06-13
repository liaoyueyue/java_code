import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:将一个由英文字母组成的字符串转换成从末尾开始每三个字母用逗号分隔的形式。
 * User: liaoyueyue
 * Date: 2022-06-13
 * Time: 15:59
 */

public class test_StringBuilber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder newstr = new StringBuilder(str); //用原字符串创建可改变的字符串
        for(int i = str.length() - 3; i >= 0; i -= 3){ //从末尾开始，三个三个遍历
            newstr.insert(i, ','); //插入逗号
        }
        System.out.println(newstr.toString()); //转变成String类输出
    }
}

