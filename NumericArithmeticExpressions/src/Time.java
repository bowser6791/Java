
public class Time {

	//Instance Variables
	double seconds;
	
	//Default Constructor
	public Time()
	{
		seconds = 0.0;
	}
	
	//Constructor
	public Time(double newSeconds)
	{
		seconds = newSeconds;
	}
	
	//Constructor
	public Time(int hours, int minutes, int newSeconds)
	{
		seconds = (double)(hours * 3600 + minutes * 60) + newSeconds;
	}
	
	//Returns seconds
	public double getTime()
	{
		return seconds;
	}
	
	//Computes and returns seconds in hours
	public int getHours()
	{
		return (int)seconds / 3600;
	}
	
	//Computes and returns the remaining minutes
	public int getMinutes()
	{
		int remainingSeconds = (int)seconds % 3600;
		
		return (int)remainingSeconds / 60;
	}
	
	//Computes and returns the remaining seconds
	public double getSeconds()
	{
		return seconds % 60;
	}
	
	public String toString()
	{
		int hours = (int)seconds / 3600;
		int minutes = (int)seconds % 3600 / 60;
		
		return hours + ":" + minutes + ":" + seconds % 60.0;
	}
	
	public Time plus(Time otherTime)
	{
		return new Time(seconds + otherTime.seconds);
	}
	
	public Time minus(Time otherTime)
	{
		return new Time(seconds - otherTime.seconds);
	}
}

