package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number of vertices: ");
        int nodes = scn.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= nodes; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.print("Enter number of edges: ");
        int edges = scn.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {

            int u = scn.nextInt();
            int v = scn.nextInt();

            if (u < 1 || u > nodes || v < 1 || v > nodes) {
                System.out.println("Invalid edge. Try again.");
                i--;
                continue;
            }

            addEdge(adj, u, v);
        }

        System.out.print("Enter starting node: ");
        int start = scn.nextInt();

        if (start < 1 || start > nodes) {
            throw new IllegalArgumentException(
                "Starting node must be between 1 and " + nodes
            );
        }

        boolean[] vis = new boolean[nodes + 1];
        ArrayList<Integer> dfsResult = new ArrayList<>();

        dfs(adj, vis, start, dfsResult, nodes);

        System.out.println("DFS Traversal:");
        for (int node : dfsResult) {
            System.out.print(node + " ");
        }

        scn.close();  
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(u).add(v);
        arr.get(v).add(u);
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj,
                           boolean[] vis,
                           int startingNode,
                           ArrayList<Integer> dfsResult,
                           int nodes) {

        if (startingNode < 1 || startingNode > nodes) {
            throw new IllegalArgumentException("Invalid starting node");
        }

        vis[startingNode] = true;
        dfsResult.add(startingNode);

        for (int neighbour : adj.get(startingNode)) {
            if (!vis[neighbour]) {
                dfs(adj, vis, neighbour, dfsResult, nodes);
            }
        }
    }
}