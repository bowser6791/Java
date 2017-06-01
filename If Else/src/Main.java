
import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int Number;
        Scanner in = new Scanner(System.in);
        PrintStream dest = System.out;
        while(in.hasNextInt()){
        Number = in.nextInt();
            if(Number == 0)
            {
                dest.print(Number + " Zero\n");
            }
            else if(Number >= 0 && Number <= 10)
            {
                dest.print(Number + " Positive, single digit\n");
            }
            else if (Number >=0&&Number<=100){
                dest.print(Number + " Positve\n");
            }
            else if(Number >= 0&&Number >= 100){
            dest.print(Number + " Positive, more than 100\n");
            }
            else if(Number <= 0&&Number <= -100){
            dest.print(Number + " Negative, less than -100\n");
            } 
        }
    }
}
