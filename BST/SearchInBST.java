package BST;

public class SearchInBST {
    public static boolean search(TreeNode node, int val) {
        TreeNode curr = node;
        while (curr != null) {
            if (curr.val == val)
                return true;
            if (curr.val < val) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        return false;
    }
}