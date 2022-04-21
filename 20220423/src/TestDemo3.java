/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-04-23
 * Time: 15:58
 */

//1~100内能被3整除也能被5整除的整数


public class TestDemo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 15 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main1(String[] args) {
        int i=1;
        while(i <= 100){
            if(i % 15 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}
