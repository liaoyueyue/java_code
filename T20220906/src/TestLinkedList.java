/**
 * Created with IntelliJ IDEA.
 * Description:测试单链表
 * User: liaoyueyue
 * Date: 2022-09-06
 * Time: 14:51
 */
public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.createList();
        singleLinkedList.display();
        singleLinkedList.contains(17);
        singleLinkedList.addIndex(1, 11);
        singleLinkedList.addIndex(3, 13);
        singleLinkedList.display();
        singleLinkedList.addIndex(5, 15);
        singleLinkedList.display();
        singleLinkedList.remove(16);
        singleLinkedList.display();
        System.out.println(singleLinkedList.size());
        singleLinkedList.clear();
        singleLinkedList.display();
    }
}
