import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
 * User: liaoyueyue
 * Date: 2022-05-29
 * Time: 16:29
 */
public class LastWordSize {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String string = in.nextLine();
            int len = string.substring(string.lastIndexOf(" ") + 1, string.length()).length();
            /**
             *  1. 找到最后一个空格
             *  2. 获取最后一个单词：从最后一个空格+1位置开始，一直截取到末尾
             *  3. 打印最后一个单词长度
             */
            System.out.println(len);
        }
        in.close();
    }
}
