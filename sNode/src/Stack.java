
public class Stack<T> {
    private sNode<T> top;
    public Stack(){
        top = null;
    }
    public void push(T data){
        sNode node = new sNode(data,top);
        top = node;
    }
    public boolean empty(){
        return top == null;
    }
    public T pop(){
         T data= top.getData();
         top = top.getNext();
         return data;
    }

}
