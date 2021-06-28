package easy.tree;

/**
 * 101. 对称二叉树
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * @author Chen Jiahao
 * @since 2021/6/28 17:20
 */
public class IsSymmetric {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.left.left = new TreeNode(3);
        tree1.left.right = new TreeNode(4);
        tree1.right = new TreeNode(2);
        tree1.right.right = new TreeNode(3);
        tree1.right.left = new TreeNode(4);

        System.out.println(isSymmetric(tree1));

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.left.left = new TreeNode(3);
        tree2.left.right = new TreeNode(4);
        tree2.right = new TreeNode(2);
        tree2.right.right = new TreeNode(4);
        tree2.right.left = new TreeNode(3);

        System.out.println(isSymmetric(tree2));

        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        } else {
            return isSymmetricNode(root, root);
        }

    }

    public static boolean isSymmetricNode(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSymmetricNode(p.left, q.right) && isSymmetricNode(p.right, q.left);
    }
}
