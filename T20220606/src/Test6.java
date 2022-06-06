/**
 * Created with IntelliJ IDEA.
 * Description:有数列为：9，99，999，...，9999999999。要求使用程序计算此数列的和，并在控制台输出结果。（请尝试使用循环的方式生成这个数列并同时在循环中求和）
 * User: liaoyueyue
 * Date: 2022-06-06
 * Time: 17:04
 */
public class Test6 {
    public static void main(String[] args) {

        long count = 1;
        long sum = 0;
        for(int i = 0; i < 10; i++){
            count *= 10;
            sum += (count-1);
        }
        System.out.println(sum);

    }
}