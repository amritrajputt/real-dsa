package BST;

public class Main {
    public static void main(String[] args) {
        InsertionInBST node = new InsertionInBST();
       
        node.insertion(10);
        node.insertion(14);
        node.insertion(13);
        node.insertion(1);
        node.insertion(3);
        node.insertion(23);
        node.insertion(2);
        node.insertion(43);
        System.out.println("Insertion completed");
        boolean found = SearchInBST.search(node.root, 13);

        System.out.println(found);
        TreeNode val = DeletionInBST.delete(node.root, 10);
        System.out.println(val.val);
    }
}
