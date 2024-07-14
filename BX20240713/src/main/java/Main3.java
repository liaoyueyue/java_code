/**
 * Created with IntelliJ IDEA.
 * Description: 孩子们的游戏（圆圈中最后剩下的数）https://www.nowcoder.com/practice/f78a359491e64a50bce2d89cff857eb6?tpId=196&ru=%2Fexam%2Foj&difficulty=&judgeStatus=&tags=&title=%E5%AD%A9%E5%AD%90%E4%BB%AC%E7%9A%84%E6%B8%B8%E6%88%8F&sourceUrl=&gioEnter=menu
 * User: liaoyueyue
 * Date: 2024-07-13
 * Time: 16:32
 */
public class Main3 {
    private int function(int n, int m) {
        if (n == 1)
            return 0;
        //递归
        int x = function(n - 1, m);
        //返回最后删除的那个元素
        return (m + x) % n;
    }
    public int LastRemaining_Solution(int n, int m) {
        //没有小朋友的情况
        if(n == 0 || m == 0)
            return -1;
        return function(n, m);
    }
}
