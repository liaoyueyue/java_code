import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:这里用于测试一些函数用法
 * User: liaoyueyue
 * Date: 2022-05-29
 * Time: 13:40
 */
public class Test_Demo {
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str.indexOf("h"));//indexOf(String str)用于确定特定字符串第一次出现的位置，返回对应字符的下标
        System.out.println(str.charAt(4));//charAt(int num)用于截取一个字符，传入的整型是字符的下标，返回的对应字符
        System.out.println("==================================");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
    }
}
