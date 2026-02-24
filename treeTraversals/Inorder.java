package treeTraversals;

import java.util.ArrayList;

public class Inorder {
    public static ArrayList<Integer> inOrderTraversals(treeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(treeNode root, ArrayList<Integer> result) {
        if (root == null)
            return;
        traverse(root.left, result);
        result.add(root.val);

        traverse(root.right, result);
    }
}
