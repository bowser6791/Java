

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner fin = new Scanner(new FileReader("names.txt"));
        Scanner nin = new Scanner(new FileReader("numbers.txt"));
        PrintStream dest = new PrintStream(System.out);
        ArrayList string = new ArrayList();//Creates ArrayList string
        if(fin.hasNext()){
            for(int i = 0;i<25;i++){ //Loops from array index 0 to 24 to give 25 names
        string.add(fin.next()); //Adds name to Array string
       
        }
    }
        dest.println(string);//Prints out Array string
       ArrayList num = new ArrayList();//Creates ArrayList num
        if(nin.hasNext()){
            for(int i = 0;i<100;i++){//Loops from array index 0 to 99 to give 100 numbers
                num.add(nin.nextLine());//Adds number to Array num
                
            }
            dest.println(num);//Prints out Array num
    }
       for(int i = 99;i>0;i--){//Loops from array index 99 to 1
       num.remove(i);//Removes array index i according to loop
       
       }
       dest.println(num);//Prints out Array num
    }
}
