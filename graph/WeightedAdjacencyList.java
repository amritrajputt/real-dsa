package graph;

import java.util.ArrayList;

class Edge {
    int node;
    int weight;

    Edge(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}
public class WeightedAdjacencyList {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 1, 2, 5);
        addEdge(adj, 1, 3, 10);
        addEdge(adj, 2, 3, 3);
        addEdge(adj, 1, 4, 7);

        print(adj, v);
    }

    private static void addEdge(ArrayList<ArrayList<Edge>> adj, int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
        adj.get(v).add(new Edge(u, w));
    }

    private static void print(ArrayList<ArrayList<Edge>> adj, int v) {
        for (int i = 1; i <= v; i++) {
            System.out.print(i + " -> ");
            for (Edge e : adj.get(i)) {
                System.out.print("(" + e.node + ", " + e.weight + ") ");
            }
            System.out.println();
        }
    }
}
