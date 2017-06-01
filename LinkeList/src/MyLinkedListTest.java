
public class MyLinkedListTest {
    public static void main(String[] args) {
       MyLinkedList list = new MyLinkedList();
       list.display();
       list.insert(8);
       list.display();
       list.insert(6);
       list.insert(9);
       list.insert(11);
       list.insert(1);
       list.insert(8);
       list.insert(-7);
       list.insert(33);
       list.insert(-2);
       list.insert(9);
       list.display();
       list.remove(11);
       list.display();
       list.remove(-7);
       list.display();
       list.displayReverse();
    }

}
