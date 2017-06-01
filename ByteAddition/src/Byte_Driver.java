
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
public class Byte_Driver
{   private static String x;
    public  static char [] readByte(Scanner f){
      x = f.next();
      char [] v = new char [8];
      for(int i = 0; i<8; i++)
      v [i] = x.charAt(i);
      return v;
    }

    public static void main(String [] args) throws IOException{

        Scanner f = new Scanner(new FileReader("byte.txt"));
        PrintStream dest = new PrintStream("bytefinal.txt");
        char [] b_1;
        char [] b_2;
        Byte b1,b2;
        while (f.hasNextLine()){
            
        b_1 = readByte(f);
        String first = x;
        b1 = new Byte(b_1);
        b_2 = readByte(f);
        b2 = new Byte(b_2);
        String second = x;
            System.out.println("");
        b2 = b2.to2s();
        Byte sum = b1.add(b2);
        boolean bad = b1.highBit()==b2.highBit()&& sum.highBit()!=b2.highBit();
        int num1 = b1.decimalValue();
        int num2 = b2.decimalValue();
            System.out.println("\t\tByte Addition");
            System.out.println("-----------------------------------------------");
            dest.println("\t\tByte Addition");
            dest.println("-----------------------------------------------");
        System.out.println(first +"\t 2's complement \t " + num1);
        dest.println(first+"\t 2's complement \t " + num1);
        System.out.println(second+ "\t biased notation\t+  "+ num2);
        dest.println(second+"\t biased notation\t+"+num2);
        System.out.println("-----------------------------------------------");
        dest.println("-----------------------------------------------");
            System.out.println("");
            dest.println("");
            

        if(bad){
            if(sum.highBit()==true){
                System.out.print("overflow");
                dest.print("overflow");
            }
            else{
                System.out.print("underflow");
                dest.print("underflow");
            }
        
        }
        else {
            System.out.print(sum.toString());
            dest.print(sum.toString());
        }
         System.out.println("\t 2's Compliment \t"+"  "+(num1+num2));
         dest.println("\t 2's Compliment \t"+"  "+(num1+num2));
         dest.println("");
        }

        
}
}