package easy.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 100. 相同的树
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * @author Pace2Car
 * @since 2021/6/28 16:29
 */
public class IsSameTree {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(1);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = null;
        tree2.right = new TreeNode(1);

        System.out.println(isSameTree(tree1,tree2));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> inorderTraversalP = inorderTraversalStack(p);
        List<Integer> inorderTraversalQ = inorderTraversalStack(q);
        return inorderTraversalP.equals(inorderTraversalQ);
    }

    public static List<Integer> inorderTraversalStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
                result.add(-10 ^ 5);
            }
            root = stk.pop();
            result.add(root.val);
            root = root.right;
        }

        return result;
    }

    /**
     * 深搜解法
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTreeDFS(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

}
