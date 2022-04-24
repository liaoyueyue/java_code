/**
 * Created with IntelliJ IDEA.
 * Description:编写程序数一下 1到 100 的所有整数中出现多少个数字9
 * User: liaoyueyue
 * Date: 2022-04-24
 * Time: 19:03
 */
public class Count_9 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 1; i <= 100; i++) {
            //看个位
            if(i %10 == 9){
                count++;
            }
            //看十位
            if(i / 10 == 9){
                count++;
            }
        }
        System.out.println("一共有"+count+"个");
    }
}
