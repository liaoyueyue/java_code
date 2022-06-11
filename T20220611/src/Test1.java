/**
 * Created with IntelliJ IDEA.
 * Description:已知接口Comparator，内部定义了max函数，用于返回两个整数中的最大值。
 *              请定义该接口的实现类，使得main方法中的比较逻辑可以正确执行，要求实现类的名称为ComparatorImpl。
 * User: liaoyueyue
 * Date: 2022-06-11
 * Time: 11:03
 */
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Comparator comparator = new ComparatorImpl();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(comparator.max(x, y));
        }
    }

}

interface Comparator {
    /**
     * 返回两个整数中的最大值
     */
    int max(int x, int y);
}

class ComparatorImpl implements Comparator{
    @Override
    public int max(int x, int y){
        return x > y ? x : y;
    }
}