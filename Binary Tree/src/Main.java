
public class Main {
    public static void main(String[] args) {
       BinarySearchTree tree = new BinarySearchTree();
       tree.insertNode(new BinaryTreeNode(5));
       tree.insertNode(new BinaryTreeNode(23));
       tree.insertNode(new BinaryTreeNode(3));
       tree.insertNode(new BinaryTreeNode(4));
       tree.insertNode(new BinaryTreeNode(12));
       tree.insertNode(new BinaryTreeNode(16));
       tree.insertNode(new BinaryTreeNode(72));
       tree.insertNode(new BinaryTreeNode(51));
       tree.insertNode(new BinaryTreeNode(9));
       tree.insertNode(new BinaryTreeNode(7));
        System.out.println("        In Order Traversal");
        System.out.println("_________________________________");
        System.out.print("     ");inOrderTraversal(tree.getRoot());
        System.out.println("");
        System.out.println("        PreOrder Traversal");
        System.out.println("_________________________________");
        System.out.print("     ");preOrderTraversal(tree.getRoot());
        System.out.println("");
        System.out.println("        PostOrder Traversal");
        System.out.println("_________________________________");
        System.out.print("     ");postOrderTraversal(tree.getRoot());
        System.out.println("");
    }
public static void inOrderTraversal(BinaryTreeNode root)
    {
        if (root == null)
            return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.getInfo()+" ");
        inOrderTraversal(root.rightChild);
    }
public static void preOrderTraversal(BinaryTreeNode root)
    {
        if (root == null)
            return;
        System.out.print(root.getInfo()+" ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
public static void postOrderTraversal(BinaryTreeNode root){
    if(root == null)
        return;
    postOrderTraversal(root.leftChild);
    postOrderTraversal(root.rightChild);
    System.out.print(root.getInfo()+" ");
}
}