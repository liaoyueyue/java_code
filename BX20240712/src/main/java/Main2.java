/**
 * Created with IntelliJ IDEA.
 * Description: 单词搜索 https://www.nowcoder.com/questionTerminal/987f2981769048abaf6180ed63266bb2
 * User: liaoyueyue
 * Date: 2024-07-12
 * Time: 16:37
 */
public class Main2 {
    /**
     * 解题思路：先把给定的board转换成二维矩阵，再二重循环找到与单词首字母相同的坐标，然后广度优先遍历矩阵。
     * 值得注意的是，遍历矩阵时，把当前坐标位置的字母置空，避免重复经过。
     * 遍历退出时再还原。从上下左右任意一个方向搜索到完整的一个单词时，就直接返回即可
     */

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param board string字符串一维数组
     * @param word string字符串
     * @return bool布尔型
     */
    public boolean exist (String[] board, String word) {
        char[][] mat = new char[board.length][board[0].length()];
        for(int i = 0; i < board.length; ++i) {
            mat[i] = board[i].toCharArray();
        }
        return exist(mat, word);
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[i].length; ++j) {
                if(board[i][j] == word.charAt(0)) {
                    if(func(board, word, 0, i , j)) return true;
                }
            }
        }
        return false;
    }
    public boolean func(char[][] board, String word, int index, int i, int j) {
        if(index >= word.length()) return true;
        if(i >= 0 && i < board.length && j >= 0 && j < board[i].length) {
            if(board[i][j] == word.charAt(index)) {
                board[i][j] = ' ';
                boolean res =  func(board, word, index + 1, i + 1, j) ||
                        func(board, word, index + 1, i , j + 1) ||
                        func(board, word, index + 1, i - 1, j) ||
                        func(board, word, index + 1, i, j - 1);
                board[i][j] = word.charAt(index);
                return res;
            }
        }
        return false;
    }
}
