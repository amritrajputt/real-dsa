package BST;

public class DeletionInBST {
    public static TreeNode delete(TreeNode root, int val) {
        if (root == null)
            return null;

        if (root.val < val) {
            root.right = delete(root.right, val);
        } else if (root.val > val) {
            root.left = delete(root.left, val);
        } else {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;
            else{
            TreeNode inOrderSuccessor = getInorderSuccessor(root);
            root.val = inOrderSuccessor.val;
            root.right = delete(root.right, inOrderSuccessor.val);
        }
        
    }
    return root;
}

    private static TreeNode getInorderSuccessor(TreeNode node) {
        node = node.right;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
