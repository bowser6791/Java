
public class Node {
private int id;
private Node next;
private String city;
public Node(){
    id = 0;
    city = null;
}
public Node(int i,String s){
    id = i;
    city = s;
}
public int getId(){
    return id;
}
public String getCity(){
    return city;
}
public void setCity(String s){
    city = s;
}
public Node getNext(){
    return next;
}
public void setNext(Node n){
    next = n;
}
}
