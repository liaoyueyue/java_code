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
            int index = -1;
            String s = in.nextLine();
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    index = i;
                    break;
                }
            }
            System.out.println(s.length()-1-index);
        }
    }




            /**
             * 1、先把字符串按空格拆分成一个字符串数组
             * 2、读取字符串数组中最后一个字符串求其长度
             */
    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String string = in.nextLine();
            String[] result = string.split(" ");
            System.out.println(result[result.length-1].length());
        }
        in.close();
    }

            /**
             *  1. 找到最后一个空格
             *  2. 获取最后一个单词：从最后一个空格+1位置开始，一直截取到末尾
             *  3. 打印最后一个单词长度
             */
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String string = in.nextLine();
            int len = string.substring(string.lastIndexOf(" ") + 1, string.length()).length();//lastIndexOf(x,y),这里是范围是[x,y)
            System.out.println(len);
        }
        in.close();
    }
}
