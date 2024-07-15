/**
 * Created with IntelliJ IDEA.
 * Description: 大数乘法
 * User: liaoyueyue
 * Date: 2024-07-14
 * Time: 17:51
 */
public class Main3 {
    public static void main(String[] args) {
        Main3 obj = new Main3();
        System.out.println(obj.solve("11", "11"));
    }

    public String solve(String s, String t) {
        //将字符串转化为数组形式
        int lenS = s.length(), lenT = t.length();
        int[] arrS = new int[lenS];
        int[] arrT = new int[lenT];
        for (int i = 0; i < lenS; i++) {
            arrS[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < lenT; i++) {
            arrT[i] = t.charAt(i) - '0';
        }
        // 存放结果
        int[] res = new int[lenS + lenT];
        // 中间 i * j 会有重复出现，如89 * 12, 会有res = [0, 8*1, 8*2+9*1, 9*2]
        for (int i = 0; i < lenS; i++) {
            for (int j = 0; j < lenT; j++) {
                // i + j + 1 是为了给进位留一个位置
                res[i + j + 1] += arrS[i] * arrT[j];
            }
        }
        // 进位的值
        int carry = 0;
        // 从最低位，也就是数组res最右边元素开始处理进位
        for (int i = lenS + lenT - 1; i >= 0; i--) {
            res[i] += carry;
            carry = res[i] / 10;
            res[i] = res[i] % 10;
        }
        StringBuilder ans = new StringBuilder();
        // 表示当前位在数组的索引，目的是找出高位的0的位置，前置的0需要忽略掉
        int cur = 0;
        while (cur < lenS + lenT && res[cur] == 0) {
            cur++;
        }
        // 收集结果
        for (int i = cur; i < res.length; i++) {
            ans.append(res[i]);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
