
public class Transmission {

	//Instance Variables
	double first;
	double second;
	double third;
	double fourth;
	double fifth;
	double sixth;
	
	public Transmission()
	{
		first = 0.0;
		second = 0.0;
		third = 0.0;
		fourth = 0.0;
		fifth = 0.0;
		sixth = 0.0;
	}
	
	public Transmission(double first, double second, double third, double fourth, double fifth, double sixth)
	{
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
		this.fifth = fifth;
		this.sixth = sixth;
	}
	
	public String toString()
	{
		return "First: " + first + "\n" +
				"Second: " + second + "\n" +
				"Third: " + third + "\n" +
				"Fourth: " + fourth + "\n" +
				"Fifth: " + fifth + "\n" +
				"Sixth: " + sixth + "\n";
	}

}
