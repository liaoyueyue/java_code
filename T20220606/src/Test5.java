/**
 * Created with IntelliJ IDEA.
 * Description:请根据给出的正则表达式来验证邮箱格式是否合法，如果用户输入的格式合法则输出「邮箱格式合法」，否则输出「邮箱格式不合法」。
 * User: liaoyueyue
 * Date: 2022-06-06
 * Time: 16:39
 */
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher="[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        //修饰符+表示至少匹配其中的一个字符
        //修饰符?表示可以匹配其中零个或一个字符
        //A-z作用等于a-zA-Z
        // \d匹配数字0-9
        // \D匹配非0-9
        // \w匹配字母、数字、下划线，除了特殊字符和空格
        // {n,m}匹配至少n次，至多m次
        // ^表示字符串匹配开始的标志
        if(str.matches(emailMatcher)){
            System.out.println("邮箱格式合法");
        }else{
            System.out.println("邮箱格式不合法");
        }

    }
}
