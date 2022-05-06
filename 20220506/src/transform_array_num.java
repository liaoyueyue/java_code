/**
 * Created with IntelliJ IDEA.
 * Description:实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
 * User: liaoyueyue
 * Date: 2022-05-06
 * Time: 23:17
 */
public class transform_array_num {
    public static void transform(int [] array){//修改传入数组元素的值
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3};
        transform(array);
        for (int x:
             array) {
            System.out.print(x+" ");
        }
    }
}
