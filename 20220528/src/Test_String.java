import java.util.Arrays;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * Description:这里测试String类的各种用法
 * User: liaoyueyue
 * Date: 2022-05-28
 * Time: 15:24
 */
public class Test_String {

    public static void main(String[] args) {
        //String trim() 去掉字符串中的左右空格,保留中间空格
        String s1 = "   Hello world   ";
        System.out.println(s1.trim());
    }
    public static void main8(String[] args) {
        //字符串的截取
        String s1 = "Hello world";
        System.out.println(s1.substring(0, s1.length()));

    }

    public static void main7(String[] args) {
        //字符串的替换和字符串的拆分
        String s1 = "Hello world";
        System.out.println(s1.replace("Hello world", "你好世界"));
        System.out.println(Arrays.toString(s1.split(" ")));
    }

    public static void main6(String[] args) {
        //字符串转数组,数组转字符串
        String s1 = "abc";
        char [] arr = {'A', 'B', 'C'};
        System.out.println(Arrays.toString(s1.toCharArray()));
        System.out.println(new String(arr));
    }

    public static void main5(String[] args) {
        //字符串大小写转化
        String s1 = "abc";
        String s2 = "ABC";
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
    }

    public static void main4(String[] args) {
        //字符串转化数字
        String s1 = "123";
        int data1 = Integer.parseInt(s1);
        int data2 = Integer.valueOf(s1);
        System.out.println(data1);
        System.out.println(data2);
    }

    public static void main3(String[] args) {
        //字符串查找
        String s1 = "hello world";
        System.out.println(s1.indexOf("e"));//这里返回字符串str第一次出现的下标
        System.out.println(s1.indexOf("o", 3));//这里从fromindex位置开始找字符串str，找到则返回字符串str第一次出现的下标
        System.out.println(s1.indexOf("o", 6));//这里从fromindex位置开始找字符串str，找到则返回字符串str第一次出现的下标
        System.out.println(s1.lastIndexOf("r"));
        //这几种方法都是返回字符串第一次出现的下标，只是找的快，找得慢
    }

    public static void main2(String[] args) {
        //字符串的比较  1、equals,判断是否相等的  2、compare，判断字符串的大小的，字符串相同则返回0
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = "hello";
        String s4 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));

    }


    public static void main1(String[] args) {
        //字符串的构造
        String s1 = "abc";
        String s2 = new String("def");
        char [] array = {'g', 'h', 'i'};
        String s3 = new String(array);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
