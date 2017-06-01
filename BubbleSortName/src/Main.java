
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args)throws IOException {
    Scanner in = new Scanner(new FileReader("Names.txt"));
    String[]name;
    name = new String[20];
    for(int i=0;i<21;i++){
        if(in.hasNext()){
           name[i]  = in.nextLine();
            
           
        }
    }
    System.out.println("                              BubbleSorter Program");
    System.out.println();
    System.out.println("                                Unsorted Names");
    System.out.println("        ____________________________________________________________________");
    System.out.println();
    printArray(name);
    System.out.println();
    System.out.println("                                Sorted Names");
    System.out.println("        ____________________________________________________________________");
    System.out.println();
    bubbleSort(name);
    printArray(name);
    }
    
public static void printArray(String[]a){
    for(int i = 0;i<5;i++){
        System.out.printf("%15s",a[i]);
}
    System.out.println();
    for(int i = 5;i<10;i++){
        System.out.printf("%15s",a[i]);
    }
    System.out.println();
    for(int i = 10;i<15;i++){
        System.out.printf("%15s",a[i]);
    }
    System.out.println();
    for(int i = 15;i<20;i++){
        System.out.printf("%15s",a[i]);
    }
    System.out.println();
        
}
public static void bubbleSort(String[]x){
    int n = x.length;
    for(int pass = 1;pass<n;pass++){
        for(int i=0;i<n-pass;i++){
        if(x[i].compareTo(x[i+1])>0){
            String temporary = x[i];
            x[i]=x[i+1];
            x[i+1]=temporary;

        }
    }
}
}
}
