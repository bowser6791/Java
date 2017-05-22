
public class Runner {

	Name name;	//Object to contain Runner's Name
	Time time;  //Object to contain Runner's Time
	
	//Default Constructor
	public Runner()
	{
		name = new Name();	//Default container for Runner's Name
		time = new Time();	//Default container for Runner's Time
		
	}
	
	public Runner(Name newName, Time newTime)
	{
		name = newName;
		time = newTime;
	}
	
	//Observer Methods
	public Name getName(){return name;}
	
	public Time getTime(){return time;}
	
	public String toString()
	{
		return name + " " + time;
	}
}
