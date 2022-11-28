/**
 * Created with IntelliJ IDEA.
 * Description:杨辉三角
 * User: liaoyueyue
 * Date: 2022-08-20
 * Time: 17:31
 */
public class YanHuiTriangle {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        //创建一个直角三角形
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || j == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.format("%" + (arr.length - i) * 2 + "s", "");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.format("%4d", arr[i][j]);
            }
            System.out.println();
        }
    }


    public static void main1(String[] args) {
        int rows = 10;

        for (int i = 0; i < rows; i++) {
            int number = 1;
            // 打印空格字符串
            System.out.format("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.format("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
