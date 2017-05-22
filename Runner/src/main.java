import java.util.*;

public class main {

	public static void main(String[] args) 
	{

		Runner runner1;		//Holds first Runner
		Runner runner2;		//Holds second Runner
		
		Time time1;			//Holds first Runner's Time
		Time time2;			//Holds second Runner's Time
		
		Time average;		//Holds average time
		Time difference;	//Holds difference between Runner's times
		Time winning;		//Holds winning times
		
		Scanner in = new Scanner(System.in);	//Scan console for input
		
		//Output instructions for input
		System.out.println("Please enter Runner's data in the following format: ");
		System.out.println("Last First Middle Time");
		
		System.out.println("Enter the name and time for Runner 1");
		String last = in.next();
		String first = in.next().trim();	//Retrieve the first name from the console while trimming leading and trailing spaces
		String middle = in.next().trim();
		
		double time = in.nextDouble();		//Also retrieve time from the console
		
		runner1 = new Runner(new Name(first, last, middle), new Time(time));	//Contain all of the information within objects Time and Name
		
		System.out.println("Enter the name and time for Runner 2");
		last = in.next();
		first = in.next().trim();	//Retrieve the first name from the console while trimming leading and trailing spaces
		middle = in.next().trim();
		
		time = in.nextDouble();		//Also retrieve time from the console
		http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=3274405
		runner2 = new Runner(new Name(first, last, middle), new Time(time));	//Contain all of the information within objects Time and Name
		
		//Output Race Report
		System.out.println();
		System.out.println("Race Report");
		System.out.println();
		System.out.println("Runner 1: " + runner1);		//Returns runners results using toString method
		System.out.println("Runner 2: " + runner2);
		
		time1 = runner1.getTime();
		time2 = runner2.getTime();
		average = new Time(time1.plus(time2).getTime()/2.0);	//Compute average time using Time() methods 
		System.out.println();
		System.out.println("Average Time: " + average);
		difference = new Time(Math.abs(time1.minus(time2).getTime()));
		System.out.println("Difference: " + difference);
		winning = new Time(Math.min(time1.getTime(),time2.getTime()));
		System.out.println("Winning time: " + winning);
	}

}
