
public class BinaryTreeNode {
    public BinaryTreeNode parent;
    public BinaryTreeNode leftChild;
    public BinaryTreeNode rightChild;
    private int info;
    public BinaryTreeNode(int info){
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
        this.info = info;
    }
    public int getInfo(){
        return this.info;
    }
}
