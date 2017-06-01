


import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;

public class AddressBookDriver
{

private static Scanner kbd;
private static AddressBook book;
public static PrintStream dest = new PrintStream(System.out);
public static String name;
public static String zip;
public static String area;

public static void main(String[] args) throws IOException
{
    kbd=new Scanner(System.in);
    book = new AddressBook("Test.txt");
    String ans = "0";
    while(!ans.equals("8")){
         dest.println("1. First entry with last name");
         dest.println("2. All entries with matchin zip code");
         dest.println("3. All entries with matching area code");
         ans = kbd.nextLine();
         if(ans.equals("1")){
            findName();
         }
             else if(ans.equals("2")){
                findZip();
             }
             else if(ans.equals("3")){
                 findArea();
             }
    }
         dest.println("Thank You");
    }


public static void findName() throws IOException {
    boolean found;
    System.out.println("Enter name");
    String name = kbd.nextLine();
    found=book.searchLast(name);
     if(found=true){
        String result = book.getResult();
        System.out.println(result);
}
    else
        System.out.println("No Match Found");


}

public static void findZip() throws IOException
{
    boolean found;
    dest.println("Enter ZIP");
    String Zip = kbd.nextLine();
    found=book.searchZip(Zip);
    if(found=true){
        String result = book.getResult();
        dest.println(result);
}
    else
        dest.println("No Match Found");

}
public static void findArea()throws IOException
{
    boolean found;
    dest.println("Enter Area Code: ");
    String area = kbd.nextLine();
    found=book.searchArea(area);
    if(found=true){
        String result = book.getResult();
        dest.println(result);
    }

}


}
