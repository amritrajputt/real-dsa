package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int rows = scn.nextInt();
        scn.close();

        for (int i = 0; i <= rows; i++) {
            adj.add(new ArrayList<>());
        }

        addList(adj, 1, 2);
        addList(adj, 1, 4);
        addList(adj, 3, 4);
        addList(adj, 2, 3);
        addList(adj, 7, 2);
        addList(adj, 5, 4);
        addList(adj, 3, 7);
        addList(adj, 2, 6);

        boolean[] vis = new boolean[rows + 1];
        ArrayList<Integer> bfsResult = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        bfs(adj, vis, 1, q, bfsResult);

        for (int i = 0; i < bfsResult.size(); i++) {
            System.out.print(bfsResult.get(i));
        }
    }

    public static void addList(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(u).add(v);
        arr.get(v).add(u);
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int startingNode, Queue<Integer> q,
            ArrayList<Integer> bfsResult) {
        vis[startingNode] = true;
        q.add(startingNode);
        
        while (!q.isEmpty()) {
            int node = q.poll();
            bfsResult.add(node);
            for (int i : adj.get(node)) {
                if (!vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
    }
}