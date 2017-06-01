
public class Time {
	
	//Instance Variables
	double seconds;
	int hours;
	int minutes;
	
	public Time()
	{
		seconds = 0.0;
	}
	
	public Time(double seconds)
	{
		this.seconds = seconds;
	}
	
	//Observers
	public double getTime()
	{
		return seconds;			//Elapsed Time
	}
	
	public int getHours()
	{
		return (int)seconds/3600;	//Whole hours independent of seconds
	}
	
	public int getMinutes()
	{
		int remainingSeconds = (int)seconds%3600;	//Compute seconds after whole hours taken out
		return remainingSeconds/60;					//and calculate minutes from that remainder
	}
	
	public double getSeconds()
	{
		return seconds%60;							//Seconds after minutes taken out
	}

	//ToString method
	public String toString()
	{
		return this.getHours() + ":" + this.getMinutes() + ":" + this.getSeconds();
	}
	
	//Operation methods
	public Time plus(Time newTime)
	{
		return new Time(seconds + newTime.seconds);	//Returns a new object that we can use observers against
	}
	
	public Time minus(Time newTime)
	{
		return new Time(seconds - newTime.seconds); //Returns a new object that we can use observers against
	}
}
