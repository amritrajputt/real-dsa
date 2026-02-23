package treeTraversals;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        treeNode root = new treeNode(1);
        root.left = new treeNode(2);
        root.right = new treeNode(3);
        root.left.left = new treeNode(4);
        root.left.right = new treeNode(5);

        List<List<Integer>> result = BFS.bfs(root);
        System.out.println(result);
    }
}