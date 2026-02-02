package graph;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class DFSusingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of vertices: ");
        int v = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
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
        boolean vis[] = new boolean[v + 1];
        Stack<Integer> st = new Stack<>();
        DFStraversal(adj, vis, 1, st, result);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
    }

    private static void addList(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private static void DFStraversal(ArrayList<ArrayList<Integer>> adj, boolean vis[],
            int startingNode, Stack<Integer> st, ArrayList<Integer> result) {
        vis[startingNode] = true;
        st.push(startingNode);
        
        while (!st.isEmpty()) {
            int node = st.pop();
            result.add(node);
            for(int i:adj.get(node)){
            if (!vis[i]) {
                vis[i] = true;
                st.push(i);

            }
        }
    }
    }
}
