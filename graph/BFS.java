package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

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
                    "Starting node must be between 1 and " + nodes);
        }

        boolean[] vis = new boolean[nodes + 1];
        ArrayList<Integer> bfsResult = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        bfs(adj, vis, start, q, bfsResult); 

        System.out.println("BFS Traversal:");
        for (int node : bfsResult) {
            System.out.print(node + " ");
        }

        scn.close();  
    }

    public static void addEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(u).add(v);
        arr.get(v).add(u);
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj,
                           boolean[] vis,
                           int startingNode,
                           Queue<Integer> q,
                           ArrayList<Integer> bfsResult) {

        vis[startingNode] = true;
        q.add(startingNode);

        while (!q.isEmpty()) {
            int node = q.poll();
            bfsResult.add(node);

            for (int neighbour : adj.get(node)) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
    }
}