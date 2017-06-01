
public class NodeDriver {

    public static void main(String[] args) {
       Node n1 = new Node(1234,"BPT");
       Node n2 = new Node(2345,"NYC");
       n1.setNext(n2);
       Node list;
       list = n1;
       n1=n2=null;
       n2= new Node(1333,"BOS");
       n2.setNext(n2);
       n2 = null;
       MyList l = new MyList(list);
       l.display();
       MyList l2 = new MyList(null);
       l2.display();
       MyList l3 = new MyList(list.getNext());
       l3.display();
       MyList l4 = new MyList(list.getNext().getNext());
       l4.display();
    }

}
