

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    
    
    public static void main(String[] args) throws IOException {
Scanner kbd=new Scanner(System.in);
Scanner in = new Scanner(new FileReader("Numbers.txt"));
int[]a;
a=new int[20];
for (int i = 0;i<20;i++)
    a[i]=in.nextInt();
System.out.println("What number are you looking for? ");
     int v = kbd.nextInt();
     boolean found = search(a,v);
     if(found)
         System.out.println("You found "+v);
         System.out.println("No match "+v);
    }
    public static boolean search(int[]x,int k){
        for(int i = 0;i<x.length;i++)
            if(x[i]==k)
                return true;
        return false;
    }

}
