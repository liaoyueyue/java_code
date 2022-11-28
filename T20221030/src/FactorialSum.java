/**
 * Created with IntelliJ IDEA.
 * Problem:计算1!+2!+3!+...+10!
 * Name: 严显鹏
 * Class: 21软工本1
 * Date: 2022-10-30
 */
public class FactorialSum {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        for (int i = 1; i <= 10; i++) {
            num = 1;
            for (int j = 1; j <= i; j++) {
                num = j * num;
            }
            sum += num;
        }
        System.out.println("1!+2!+3!+...+10! = " + sum);
    }

}
