import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-23
 * Time: 21:20
 */

//n*n乘法表的输出

public class Table_NxN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入n：");
        int input = in.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.print("\n");
        }
    }
}
