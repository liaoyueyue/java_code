import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2023-02-28
 * Time: 18:59
 */
public class Recurrence {
    public static void main(String[] args) {
        System.out.println(menu());
    }

    public static String menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("这里是菜单");
        if (in.nextInt() == 0) {
            return "菜单已经退出";
        } else {
            return menu();
        }

    }
}
