import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-23
 * Time: 16:21
 */

//测试输入输出，，姓名，年龄，性别

public class TestScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String name = in.nextLine();//nextLine是读取一整行的内容
        System.out.println("请输入你的年龄：");
        String age = in.nextLine();
        System.out.println("请输入你的性别");
        String sex = in.nextLine();
        System.out.println("性别："+name+"  年龄："+age+"  性别："+sex);
    }
}
