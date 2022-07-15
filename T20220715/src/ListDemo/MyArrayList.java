package ListDemo;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:顺序表的练习
 * User: liaoyueyue
 * Date: 2022-07-15
 * Time: 17:57
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        elem = new int[DEFAULT_CAPACITY];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 新增元素,默认在数组最后新增
    public void add(int data) {
        if (isFull()) {
            elem = Arrays.copyOf(elem, 2 * elem.length);
        }
        elem[usedSize++] = data;
    }

    private boolean isFull() {
        return usedSize == elem.length;
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        return true;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        return -1;
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        return -1;
    }

    // 给 pos 位置的元素设为 value
    public void set(int pos, int value) {
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
    }

    // 获取顺序表长度
    public int size() {
        return 0;
    }

    // 清空顺序表
    public void clear() {
    }
}

