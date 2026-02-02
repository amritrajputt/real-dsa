package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int row = sc.nextInt();
        sc.close();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= row; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 2);
        addEdge(adj, 1, 4);
        print(adj, row);
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);

        // adj.get(u).add(v); //for directed add only this line

    }

    private static void print(ArrayList<ArrayList<Integer>> adj, int row) {
        for (int i = 1; i <= row; i++) {
            System.out.print(i + " -> ");
            for (int node:adj.get(i)) {
                System.out.print(node+ " ");
            }
            System.out.println();
        }
    }
}
