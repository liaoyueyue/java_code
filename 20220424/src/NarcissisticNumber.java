/**
 * Created with IntelliJ IDEA.
 * Description:求水仙花数
 * User: liaoyueyue
 * Date: 2022-04-24
 * Time: 8:53
 */

/*
求出0～999之间的所有“水仙花数”并输出。
(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数“。）
*/

public class NarcissisticNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            int unit = i%10;   //个位
            int tens = i/10%10; //十位
            int handreds = i/100%10; //百位
            if(i == unit*unit*unit + tens*tens*tens + handreds*handreds*handreds){
                System.out.print(i + "  ");
            }
        }
    }

    public static void main1(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if(k*100+j*10+i == k*k*k+j*j*j+i*i*i){
                        System.out.print(k*100+j*10+i+"  ");
                    }
                }
            }
        }

    }
}
