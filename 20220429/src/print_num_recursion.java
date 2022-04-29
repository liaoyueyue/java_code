import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
 * User: liaoyueyue
 * Date: 2022-04-29
 * Time: 20:40
 */
public class print_num_recursion {

    public static void print_num(int n){
        if(n > 9){
            print_num(n/10);
        }
        System.out.print(n%10+" ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("顺序打印数字每一位,请输入n:");
        int n = in.nextInt();
        print_num(n);
    }
}
