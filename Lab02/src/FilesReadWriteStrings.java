
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;
public class FilesReadWriteStrings {
    public static void main(String args[]) throws IOException {
    String myString;
    int length;
    int sum=0;
    FileReader fin = new FileReader("Test.txt");
    Scanner src = new Scanner(fin);
	PrintStream dest = new PrintStream("Out.txt");
	dest.print("String Length = ");
        while (src.hasNext()) {
		myString = src.next();
                length =myString.length();
                sum = sum+length;
	}
        dest.print(""+sum);
    fin.close();
  }
}
