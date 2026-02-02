package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
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
        ArrayList<Integer> dfsResult = new ArrayList<>();

        dfs(adj, vis, 1, dfsResult);

        for (int i = 0; i < dfsResult.size(); i++) {
            System.out.print(dfsResult.get(i));
        }
    }

    public static void addList(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(u).add(v);
        arr.get(v).add(u);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int startingNode,
            ArrayList<Integer> dfsResult) {
        vis[startingNode] = true;
        dfsResult.add(startingNode);
        for (int i : adj.get(startingNode)) {
            if (!vis[i]) {
                dfs(adj, vis, i, dfsResult);
            }
        }
    }
}