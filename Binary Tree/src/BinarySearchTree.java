
public class BinarySearchTree {
    private BinaryTreeNode root;
    public BinarySearchTree(){
        this.root = null;
    }
    public void insertNode(BinaryTreeNode node){
        if (this.root == null){
            this.root = node;
        }
        else{
            follow(node, this.root);
        }
    }
    private void follow(BinaryTreeNode node, BinaryTreeNode start){
        Integer data = start.getInfo();
        if (data.compareTo(node.getInfo()) > 0){
            if (start.leftChild == null){
                start.leftChild = node;
                node.parent = start;
            }
            else{
                follow(node, start.leftChild);
            }
        }
        else{
            if (start.rightChild == null){
                start.rightChild = node;
                node.parent = start;
            }
            else{
                follow(node, start.rightChild);
            }
        }
    }
    public BinaryTreeNode getRoot(){
        return this.root;
    }
}


