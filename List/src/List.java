
public class List <T> {
private int count;
private T [] data;
public List(){
    this(10);
}
public List(int s){
    data = (T[])new Object[s];
    count = 0;
}
public boolean empty(){
    return count == 0;
}
public boolean full(){
    return count == data.length;
}
public void addF(T e){
    if(full())
        return;
    for(int i = count;i > 0;i--)
        data[i]=data[i-1];
        data[0]=e;
        count++;
}
public void addL(T e){
    if(full())
        return;
    data[count++]=e;
}
public T removeL(){
    if(empty())
        return null;
    T temp = data[count-1];
    count--;
    return temp;
    }
public T removeF(){
if(empty())
    return null;
T temp = data[0];
for(int i =1;i<count;i++)
    data[i-1]=data[i];
    count--;
    return temp;
}
public void display(){
    for(int i = 0;i<count;i++)
        System.out.println(data[i]);
}
}
