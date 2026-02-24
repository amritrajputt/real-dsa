package treeTraversals;

import java.util.ArrayList;

public class PreOrder {
    public static ArrayList<Integer> preOrderTraversals(treeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(treeNode root, ArrayList<Integer> result) {
        if (root == null) return;

        result.add(root.val);
        traverse(root.left, result);
        traverse(root.right, result);
    }
}
