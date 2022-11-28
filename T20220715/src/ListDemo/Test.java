package ListDemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-07-17
 * Time: 16:30
 */
public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0, 0);
        myArrayList.add(1, 1);
        myArrayList.add(2, 2);
        myArrayList.add(3, 3);
        myArrayList.add(4, 2);
        myArrayList.display();
        System.out.println(myArrayList.get(3));
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.indexOf(1));
        myArrayList.remove(2);
        myArrayList.display();
        myArrayList.clear();
        myArrayList.add(0, 0);
        myArrayList.add(1, 1);
        myArrayList.add(2, 2);
        myArrayList.add(4);
        myArrayList.display();
    }
}
