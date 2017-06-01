
public class MyList {
private Node head;
    public MyList(Node h){
        head = h;
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(""+current.getCity());
            current = current.getNext();
        }
        System.out.println("List Complete");
    }
}
