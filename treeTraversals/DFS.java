package treeTraversals;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    public static ArrayList<ArrayList<Integer>> bfs(treeNode root) {
        List<List<Integer>> dfstraversal = new ArrayList<>();
        if(root.left != null){
            root = root.left;
            if(root.left == null) dfstraversal.add(root.val);
        }
        
    }
}
