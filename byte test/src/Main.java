
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("byte.txt"));
   int[]a;
    a=new int[8];
    for(int i=0;i<8;i++){
        if(in.hasNextInt()){
           a[i]=in.nextInt();

        }
        System.out.print(a[i]);
        
        
    }
        System.out.println();
     
    }
   
    }


