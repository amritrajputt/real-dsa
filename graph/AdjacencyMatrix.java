package graph;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        int v= 4;
        int[][] matrix = new int[v+1][v+1];
        
        addEdge(matrix,1,2);
        addEdge(matrix,1,3);
        addEdge(matrix,3,2);
        addEdge(matrix,1,4);
        print(matrix, v);
    }

    private static void addEdge(int matrix[][] ,int i,int j){
        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }
    private static void print(int [][] matrix,int v){
        for(int i = 1;i<=v;i++){
            for(int j =1;j<=v;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
