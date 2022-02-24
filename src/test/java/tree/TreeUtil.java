package tree;

public class TreeUtil {

    public static TreeNode treeByArray(Integer... elements) {
        TreeNode root = null;
        root = insertLevelOrder(elements, root, 0);
        return root;
    }

    private static TreeNode insertLevelOrder(Integer[] arr, TreeNode root, int i) {
        if (i < arr.length && arr[i] != null) {
            root = new TreeNode(arr[i]);
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public static void print(TreeNode node) {
        print("", node, false);
    }

    public static void print(String prefix, TreeNode n, boolean isLeft) {
        if (n != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + n.val);
            print(prefix + (isLeft ? "|   " : "    "), n.left, true);
            print(prefix + (isLeft ? "|   " : "    "), n.right, false);
        }
    }
}
