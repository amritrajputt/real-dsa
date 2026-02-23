package treeTraversals;

public class treeNode {
    int val;
    treeNode left;
    treeNode right;
    public treeNode(int value) {
        this.val = value;
        this.left = null;
        this.right = null;
    }

    public static treeNode left(treeNode node){
         return (node == null) ? null : node.left;
    }
      public static treeNode right(treeNode node){
         return (node == null) ? null : node.right;
    }
}
