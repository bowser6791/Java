
public class Sorter <T extends Comparable> {
private T[] data;
public Sorter(){
    this(null);
}
public Sorter(T[]data){
    this.data=data;
}
public void setData(T[]data){
    this.data=data;
}
public void quicksort(){
    quicksort(0,data.length-1);
}
private void quicksort(int lo, int hi){
    int pivotIndex;
    if(lo<hi){
        pivotIndex = partition(lo,hi);
        quicksort(lo,pivotIndex-1);
        quicksort(pivotIndex+1,hi);
    }}

int partition(int lo, int hi){
    int i = lo, j = hi;
    T pivot = data[lo];
    while(i<=j){
        while(i<=hi && data[i].compareTo(pivot)<=0)i++;
        while(data[j].compareTo(pivot)>0)j--;
        if (i<j)
            swap(i,j);
    }
    swap(lo,j);
    return j;}
void swap(int i,int j){
    T temp = data[i];
    data[i]=data[j];
    data[j] = temp;
}
void display(){
    System.out.print("[");
    for(int i = 0; i < data.length-1;i++)
        System.out.print(data[i]+",");
    System.out.println(data[data.length-1]+"]");
}
}