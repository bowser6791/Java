import java.util.*;
public class TimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter a time as minutes:seconds");
	String inTime = in.nextLine();
	inTime = inTime.trim();
	int colon = inTime.indexOf(":");
	String minuteString = inTime.substring(0, colon);	//Starting at the beginning of the string grab everything up until the colon
	String secondString = inTime.substring(colon+1,inTime.length()); //Starting at the position after the colon grab everything up until the end
	Scanner minScan = new Scanner(minuteString);	//scanner for our new Minutes string
	Scanner secScan = new Scanner(secondString);	//scanner for our new Seconds string
	System.out.println("Time in seconds is: " + (minScan.nextDouble()*60+secScan.nextDouble()));
	}

}
