/**
 * Created with IntelliJ IDEA.
 * Description:递归求 1 + 2 + 3 + ... + 10
 * User: liaoyueyue
 * Date: 2022-04-29
 * Time: 21:09
 */
public class sum_recursion {

    public static int SumRecursion(int n){
        if(n == 0){
            return 0;
        }else{
            return n+SumRecursion(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(SumRecursion(n));
    }
}
