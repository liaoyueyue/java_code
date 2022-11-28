/**
 * Created with IntelliJ IDEA.
 * Description:单链表
 * User: liaoyueyue
 * Date: 2022-09-06
 * Time: 13:39
 */
public class SingleLinkedList {
    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node head;

    public void createList() {
        Node node1 = new Node(10);
        Node node2 = new Node(12);
        Node node3 = new Node(14);
        Node node4 = new Node(16);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }


    //头插法
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        }else{
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data) {
        Node node = new Node(data);
        if (head == null) {
            addFirst(data);
        } else if (index == size()-1) {
            addLast(data);
        }else{
            Node cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            node.next = cur.next;
            cur.next = node;
        }
        return true;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        if(head == null){
            return false;
        }
        Node cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (head.val == key) {
            head = head.next;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.val == key) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node cur = head;
        while (cur != null) {

        }
    }

    //得到单链表的长度
    public int size() {
        Node cur = head;
        int count = 1;
        while (cur != null) {
            if (cur.next != null) {
                count++;
            }
            cur = cur.next;
        }
        return count;
    }

    //打印链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+ " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //清理链表
    public void clear(){
        Node cur = head;
        Node curnext = head.next;
        while (cur != null) {
            cur = null;
            cur = curnext;
            curnext = curnext.next;
        }
    }

}
