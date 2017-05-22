
public class Car {
	
	//Parts of the Car
	Engine engine;
	Transmission transmission;
	
	//Instance Variables (Attributes of the Car)
	String Year;
	String Make;
	String Model;
	String Color;
	String BodyStyle;
	int Mileage;
	
	//Constructors
	public Car()
	{
		Year = "";
		Make = "";
		Model = "";
		Color = "";
		BodyStyle = "";
		Mileage = 0;
		
		engine = new Engine();
		transmission = new Transmission();
	}
	
	public Car(String year, String make, String model, String color, String bodystyle, int mileage, Engine enginetype, Transmission transmissiontype)
	{
		Year = year;
		Make = make;
		Model = model;
		Color = color;
		BodyStyle = bodystyle;
		Mileage = mileage;
		
		engine = enginetype;
		transmission = transmissiontype;
	}
	
	public String toString()
	{
		return "Specifications of your "+ Color + " " + Year + " " + Make + " " + Model + " " + BodyStyle + " with " + Mileage + " miles are:\n" + engine + transmission;
	}

}
