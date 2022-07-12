import java.time.temporal.Temporal;

/**
 * Created with IntelliJ IDEA.
 * Description:二叉树
 * User: liaoyueyue
 * Date: 2022-07-12
 * Time: 13:02
 */
public class BinaryTree {
    static class TreeNode{
        public char val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(char val) {
            this.val = val;
        }
    }

    //二叉树根节点
    public TreeNode root;

    public void createTree() {
        //这里直接根据已知的创建
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');

        A.left = B;
        A.right = C;
        B.right = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        this.root = A;
    }
    //前序遍历，按照根左右
    void preOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //中序遍历，按照左根右
    void inOrder(TreeNode root){
        if(root == null) return;
        preOrder(root.left);
        System.out.print(root.val+ " ");
        preOrder(root.right);
    }
    //后序遍历，按照左右根
    void postOrder(TreeNode root){
        if(root == null) return;
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+ " ");
    }
}
