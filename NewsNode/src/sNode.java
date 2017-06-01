
public class sNode<T> {

    private T data;
    private sNode next;
    public sNode(T data,sNode next){
        this.data=data;
        this.next=next;
    }
    public T getData(){
        return data;
    }
    public void setNext(sNode next){
        this.next = next;
    }
    public sNode getNext(){
        return next;
    }


}
