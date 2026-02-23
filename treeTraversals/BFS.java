package treeTraversals;

import java.util.*;

public class BFS {

    public static List<List<Integer>> bfs(treeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<treeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                treeNode current = queue.poll();

                level.add(current.val);

                if (current.left != null)
                    queue.offer(current.left);

                if (current.right != null)
                    queue.offer(current.right);
            }

            result.add(level);
        }

        return result;
    }
}