/**
 * Created with IntelliJ IDEA.
 * Description:输出 1000 - 2000 之间所有的闰年
 * User: liaoyueyue
 * Date: 2022-04-24
 * Time: 15:43
 */
public class PrintLeapYear {
    public static void main(String[] args) {
        int count = 0; //用来计数，之后每15个换一次行
        for (int i = 1000; i <= 2000; i++) {
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                System.out.print(i+"  ");
                count++;
                if(count %15 == 0){ //每15个换一次行
                    System.out.print("\n");
                }
            }
        }
    }
}
