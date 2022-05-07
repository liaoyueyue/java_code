/**
 * Created with IntelliJ IDEA.
 * Description:现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.
 * User: liaoyueyue
 * Date: 2022-05-07
 * Time: 12:08
 */
public class ArrayToString {
    public static String my_toString(int [] array){
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length-1){
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(my_toString(array));
    }
}
