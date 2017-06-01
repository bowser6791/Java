
public class MyLinkedList {
    private ListNode head;
    private ListNode curr;
public MyLinkedList(){
    head = curr = null;
}
public boolean insert(int key){
    if(head == null){
        ListNode node = new ListNode(key,null);
        head = node;
        return true;
    }
    ListNode prev = search(key);
    if (prev != null){
        ListNode nextOfPrev = prev.getNext();
        ListNode node = new ListNode(key,nextOfPrev);
        prev.setNext(node);
    }
 else {
        ListNode node = new ListNode(key,head);
        head = node;
 }
    return true;
}
public boolean remove(int key){
    ListNode prev = search(key);
    if(prev == null){
        if(head.getData()==key)
            head = head.getNext();
        else
            return false;
    }
 else
     if(prev.getNext().getData()==key){
         ListNode del = prev.getNext();
         prev.setNext(del.getNext());
         return true;
     }
 else
     return false;

    return true;

}
private ListNode search(int key){
    ListNode prev = null;
    curr = head;
    boolean done = false;
    while(curr != null && !done){
        if(curr.getData()<key){
            prev = curr;
            curr = curr.getNext();
        }
 else
     done = true;
    }
    return prev;
}
public void display(){
    ListNode curr = head;
    System.out.print("[");
    while(curr!= null){
        System.out.print(curr.getData());
        if(curr.getNext() != null)
            System.out.print(",");
        curr = curr.getNext();
    }
    System.out.println("]");
}
public void displayReverse(){
    System.out.print("[");
    displayReverse(head);
    System.out.println("]");
}
public void displayReverse(ListNode node){
    if(node == null){
        return;
    }

 else{
        displayReverse(node.getNext());
        System.out.print(node.getData());
        if(node != head)
            System.out.print(",");
 }
}
}
