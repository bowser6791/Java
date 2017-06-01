
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

public class AddressBook
{

private Scanner file;
private String fileName;
private Entry entry;
private String stringResult;

public AddressBook(String fileName)
{
    this.fileName=fileName;

     
}
public    Entry readEntry()
    {

    String last = file.next();
    String middle = file.next();
    String first = file.next();
    String street = file.nextLine();
    String city = file.next();
    String state = file.next();
    String zip = file.next();
    String area = file.next();
    String exchange = file.next();
    String digits = file.next();

    entry = new Entry(last,middle,first,street,city,state,zip,area,exchange,digits);
    return entry;
}
public boolean searchLast(String name) throws IOException
{
    boolean found = false;
    stringResult ="\n";
    file = new Scanner(new FileReader("Test.txt"));
    while (!found && file.hasNextLine()){
        entry = readEntry();
        if (entry.getLast().equalsIgnoreCase(name)){
            found = true;
            stringResult = stringResult+entry.toString();
        }
    }
    file.close();
    return found = true;
}
public boolean searchZip(String zip) throws IOException
{
       boolean found = false;
    stringResult ="\n";
    file = new Scanner(new FileReader(fileName));
    while (file.hasNextLine()){
        entry = readEntry();
        if (entry.getZip().equalsIgnoreCase(zip)){
            found = true;
            stringResult = stringResult+entry.toString();
        }
    }
    file.close();
    return found = true;
}
public boolean searchArea(String area) throws IOException
{
    boolean found = false;
    stringResult ="\n";
    file = new Scanner(new FileReader(fileName));
    while (file.hasNextLine()){
        entry = readEntry();
        if (entry.getArea().equalsIgnoreCase(area)){
            found = true;
            stringResult = stringResult+entry.toString();
        }
    }
    file.close();
    return found = true;
}
public String getResult()
{
    return stringResult;
}
}


