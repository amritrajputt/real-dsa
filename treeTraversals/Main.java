package treeTraversals;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        treeNode root = new treeNode(1);
        root.left = new treeNode(2);
        root.right = new treeNode(3);
        root.left.left = new treeNode(4);
        root.left.right = new treeNode(5);

        List<List<Integer>> result = BFS.bfs(root);
        System.out.println(result);

        ArrayList<Integer> preOrder = PreOrder.preOrderTraversals(root);
        System.out.println(preOrder);

        ArrayList<Integer> inOrder = Inorder.inOrderTraversals(root);
        System.out.println(inOrder);
        
        ArrayList<Integer> postOrder = PostOrder.postOrderTraversals(root);
        System.out.println(postOrder);

    }
}