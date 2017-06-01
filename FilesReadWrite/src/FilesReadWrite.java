
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;
public class FilesReadWrite {
public static void main(String args[])throws IOException {
    
    String myString;
    FileReader fin = new FileReader("Test.txt");
    Scanner src = new Scanner(fin);
    PrintStream dest = new PrintStream("Out.txt");
    int count;
    while (src.hasNextLine()) {
		myString = src.nextLine();
		char[] a = myString.toCharArray();
                dest.print(a);
                
                
                    
	}
	


    fin.close();
  }
}