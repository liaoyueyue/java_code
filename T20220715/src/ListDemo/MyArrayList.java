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

    /**
     * 检查add元素的时候，pos位置是否合法
     *
     * @param pos
     */
    private void checkAddPos(int pos) {
        if (pos < 0 || pos > usedSize) {
            throw new PosIndexNotLegalException("pos位置不合法");
        }
    }

    // 在 pos 位置新增元素(插入元素)
    public void add(int pos, int data) {
        try {
            checkAddPos(pos);
            if (isFull()) {
                elem = Arrays.copyOf(elem, 2 * elem.length);
            }
            for (int i = usedSize - 1; i >= pos; i--) {
                elem[i + 1] = elem[i];
            }
            elem[pos] = data;
            usedSize++;
        } catch (PosIndexNotLegalException e) {
            e.printStackTrace();
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (toFind == elem[i]) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (toFind == elem[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 检查pos位置的数据 检查合法性
     *
     * @param pos
     */
    private void checkGetPos(int pos) {
        if (pos < 0 || pos >= usedSize) {
            throw new PosIndexNotLegalException("pos位置不合法");
        }
    }

    // 获取 pos 位置的元素
    public int get(int pos) {
        checkGetPos(pos);
        return elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void set(int pos, int value) {
        checkGetPos(pos);
        elem[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = indexOf(toRemove);
        if (index == -1) {
            System.out.println("没有找的需要删除的数字");
            return;
        }
        for (int i = index; i < usedSize - 1; i++) {
            elem[i] = elem[i + 1];
        }
//        elem[usedSize-1] = null;
        usedSize--;

    }

    // 获取顺序表长度
    public int size() {
        return usedSize;
    }

    // 清空顺序表
    public void clear() {
        elem = new int[DEFAULT_CAPACITY];
        usedSize = 0;
    }
}

