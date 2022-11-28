/**
 * Created with IntelliJ IDEA.
 * Description:
                 * 罗马数字转整数
                 * 罗马数字包含以下七种字符: I ， V ， X ， L ， C ， D 和 M 。
                 * 字符 数值 I 1 V 5 X 10 L 50 C 100 D 500 M 1000
                 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做 XXVII, 即为 XX + V + II 。
                 *
                 * 来源：力扣（LeetCode）
                 * 链接：https://leetcode.cn/problems/roman-to-integer
                 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * User: liaoyueyue
 * Date: 2022-09-03
 * Time: 11:12
 */
class RomanToInt {

    public int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            int num = getValue(s.charAt(i));
            if(preNum < num){
                sum -= preNum;
            }else{
                sum += preNum;
            }
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
    private int getValue(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }

}
