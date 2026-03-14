package BST;

public class InsertionInBST {
    TreeNode root;

    public void insertion(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }
        TreeNode curr = root;
        while (true) {
            if (curr.val < val) {
                if(curr.right == null){
                    curr.right = new TreeNode(val);
                    return;
                }
                curr = curr.right;
            }else{
                if(curr.left == null){
                    curr.left = new TreeNode(val);
                    return;
                }
                curr = curr.left;
            }
        }
    }
}
