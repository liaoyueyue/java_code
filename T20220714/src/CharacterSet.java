import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *              字符集合
 *              输入一个字符串，求出该字符串包含的字符集合，按照字母输入的顺序输出。
 *              数据范围：输入的字符串长度满足 1 <= n <= 100  ，且只包含大小写字母，区分大小写。
 *              牛客链接：
 *              https://www.nowcoder.com/questionTerminal/784efd40ed8e465a84821c8f3970b7b5
 * User: liaoyueyue
 * Date: 2022-07-14
 * Time: 21:32
 */
public class CharacterSet {

    public static String characterSet(String str){
        boolean[] a = new boolean[255];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(a[ch] == false){
                stringBuilder.append(ch);
                a[ch] = true;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            System.out.println(characterSet(str));
        }
    }

}
