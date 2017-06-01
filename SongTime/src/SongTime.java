import java.util.*;
public class SongTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarations
		int seconds;
		double price;
		String name;
		
		Scanner in = new Scanner(System.in);
		
		//Ask user for input
		System.out.println("Enter the price, the time of the song in seconds");
		System.out.println("and the name of the song, all seperated by spaces");
		
		//Read in data from user
		price = in.nextDouble();
		seconds = in.nextInt();
		name = in.nextLine();
		
		//Output
		System.out.println();
		System.out.println(name + " costs " + price + "and is " + seconds/60 + " minute(s), and " + seconds%60 + " second(s) long." );
		System.out.println("Cost per minute is " + (double)price/((double)seconds/60));
	}

}
