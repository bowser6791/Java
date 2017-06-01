import java.util.*;
public class TimeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner in = new Scanner(System.in);
	
	System.out.println("Please enter a time in seconds");
	double someTime = in.nextDouble();
	
	System.out.println("Please enter another time in seconds");
	double otherTime = in.nextDouble();

	Time firstTime = new Time(someTime);
	Time secondTime = new Time(otherTime);
	
	System.out.println("The first time you entered was: " + firstTime);
	System.out.println("The second time you entered was: " + secondTime);
	
	System.out.println("The sum of both times is: " + firstTime.plus(secondTime));
	System.out.println("The difference of both times is: " + secondTime.minus(firstTime));
	
	System.out.println("The first time in seconds: " + firstTime.getTime());
	System.out.println("The second time in seconds: " + secondTime.getTime());
	
	System.out.println("The sum in seconds: " + firstTime.plus(secondTime).getTime());
	System.out.println("The difference in seconds: " + secondTime.minus(firstTime).getTime());
	}

}
