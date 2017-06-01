

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class Driver {
    
    public static char [] readByte(Scanner f)
      { 
       char [] a = new char [8];
        for (int i=0;i<8;i++)
        {
            a[i]=f.next().charAt(i);
        }
          return a; 
      }

    
    
   
    public static void main(String[] args) throws IOException
    {
        Scanner fin = new Scanner(new FileReader("Byte.txt"));
        PrintStream dest = new PrintStream("Out.txt");
        Byte b1,b2;
        char [] c;
        c =  readByte(fin);
        b1 = new Byte(c);
        c =  readByte(fin);
        b2 = new Byte(c);
        b1.print(dest);
        System.out.println("\t+2's Compliment \t\t"+b1.decVal());
        b2.print(dest);
        System.out.println("\t+Bias Notation \t\t"+b2.decVal());
        System.out.println("_____________________________\n"+b2.to2s().decVal());
        Byte sum= b1.add(b2);
        boolean bad = b1.hiBit()==b2.hiBit()&&sum.hiBit()!=b1.hiBit();
        if (bad)
            if (sum.hiBit()==true)
                System.out.print("Overflow");
            else System.out.print("Underflow");
        else 
            sum.print(dest);
        System.out.println("\t");
        System.out.println("\t");
        System.out.println(b1.decVal()+ b2.to2s().decVal());
    }
    
}




  


