/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2022-07-12
 * Time: 14:10
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createTree();
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
    }
}
