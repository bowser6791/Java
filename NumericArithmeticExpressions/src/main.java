
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tests 1-6
		Time time1 = new Time();
		
		Time time2 = new Time(3845.123);
		
		Time time3 = new Time(8, 2, 5.5);
		
		System.out.println("Tests 1-6");
		System.out.println("Created time1 = " + time1.getTime() +
								  " time2 = " + time2.getTime() +
								  " time3 = " + time3.getTime());
		
		//Test 7-9
		System.out.println("Test 7-9");
		System.out.println("time3 = " + time3.getSeconds() + " hours, " +
									    time3.getMinutes() + " minutes, " +
										time3.getSeconds() + " seconds.");
		//Test 10
		System.out.println("Tests 10");
		System.out.println("time2.plus(time3) = " + 
							time2.plus(time3).getTime());  //Adds time2 and time3 objects together then returns the number of seconds
		
		//Test 11
		System.out.println("Tests 11");
		System.out.println("time3.minus(time2) = " + 
							time3.plus(time2).getTime());  //Adds time2 and time3 objects together then returns the number of seconds
				
		//Test 12-14
		//Having a class with a toString() method simply returns the object requested as a formatted String
				System.out.println("Test 12-14");
				System.out.println("Using toString, time1 = " + time1 +
								   ", time2 = " + time2 +
								   ", time3 = " + time3);

	}

}
