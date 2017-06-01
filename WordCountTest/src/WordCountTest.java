
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCountTest {
    public static void main(String[] args) throws IOException { 
        FileReader fin = new FileReader("Test.txt");
    Scanner src = new Scanner(fin);
int count=0;
while(src.hasNext()){
    src.next();
    count++;
}
System.out.println("Number of words: " + count);
    }
}
