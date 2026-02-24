package treeTraversals;

import java.util.ArrayList;

public class PostOrder{
    public static ArrayList<Integer> postOrderTraversals(treeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(treeNode root, ArrayList<Integer> result) {
        if (root == null)
            return;
        traverse(root.left, result);
        traverse(root.right, result);
        result.add(root.val);
    }
}
