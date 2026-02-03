package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of node: ");
        int node = sc.nextInt();
        sc.close();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= node; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 2);
        addEdge(adj, 1, 4);
        print(adj, node);
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);

        // adj.get(u).add(v); //for directed add only this line

    }

    private static void print(ArrayList<ArrayList<Integer>> adj, int node) {
        for (int i = 1; i <= node; i++) {
            System.out.print(i + " -> ");
            for (int nodes:adj.get(i)) {
                System.out.print(nodes+ " ");
            }
            System.out.println();
        }
    }
}
