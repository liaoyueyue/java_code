/**
 * Created with IntelliJ IDEA.
 * Description:这里练习泛型的运用
 * User: liaoyueyue
 * Date: 2022-07-10
 * Time: 13:09
 */

class MyArray<T>{
    public T[] array = (T[]) new Object[10];

    public T getPos(int pos) {
        return this.array[pos];
    }

    public void setVal(int pos, T Val) {
        this.array[pos] = Val;
    }
}



public class test_genericity {
    public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<>();//类型后加入 <Integer> 指定当前类型
        myArray.setVal(0, 123);
        myArray.setVal(1, 456);
        int ret = myArray.getPos(0);//这里不需要进行强制类型转换
        System.out.println(ret);
        //myArray.setVal(2, "bit");//这里会进行类型检查所以会出现编译报错


    }
}
