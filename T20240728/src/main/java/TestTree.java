/**
 * Created with IntelliJ IDEA.
 * Description: 树是一种重要的数据结构，用于构建层次性的数据表示。常见的树结构包括二叉树、二叉搜索树和平衡二叉树。以下是一个二叉树的简单示例：
 * User: liaoyueyue
 * Date: 2024-08-25
 * Time: 2:30
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class TestTree {
    public static void main(String[] args) {
        // 建立二叉树需要实例化每个节点，并构建各节点的引用指向。
        // 初始化节点
        TreeNode n1 = new TreeNode(3); // 根节点 root
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(2);
        // 构建引用指向
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;

    }
}
