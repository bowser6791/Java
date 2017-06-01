
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class NewClass {
public static String  L,M,F,S,C,ST,Z,A,E,N;


    public static void H(String[] args)throws IOException {
       FileReader fin = new FileReader("Test.txt");
      Scanner src = new Scanner(fin);

while(src.hasNext()){
          L = src.next();
          M = src.next();
          F = src.nextLine();
          S = src.nextLine();
          C = src.next();
          ST = src.next();
          Z = src.next();
          A = src.next();
          E = src.next();
          N = src.next();
         

         
        
        }
    }
}

