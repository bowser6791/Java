
public class Engine 
{
	//Instance Variables
	String Designation;
	String Manufacturer;
	String Configuration;
	int	Displacement;
	double CylinderBore;
	int PistonStroke;
	String	CylinderBlockMaterial;
	String 	CylinderHeadMaterial;
	String	ValvetrainType;
	
	//Constructors
	public Engine()
	{
		Manufacturer = "";
		Configuration = "";
		Displacement = 0;
		CylinderBore = 0.0;
		PistonStroke = 0;
		CylinderBlockMaterial = "";
		CylinderHeadMaterial = "";
		ValvetrainType = "";
		
	}
	
	
	public Engine(String des,String mfr, String config, int disp, double bore, int stroke, String blkmtrl, String headmtrl, String valvtrn)
	{
		Designation = des;
		Manufacturer = mfr;
		Configuration = config;
		Displacement = disp;
		CylinderBore = bore;
		PistonStroke = stroke;
		CylinderBlockMaterial = blkmtrl;
		CylinderHeadMaterial = headmtrl;
		ValvetrainType = valvtrn;
	}
	
	//Observers
	public String getDesignation()
	{
		return Designation;
	}
	
	public String getManufacturer()
	{
		return Manufacturer;
	}
	
	public String getConfiguration()
	{
		return Configuration;
	}
	
	public int getDisplacemnet()
	{
		return Displacement;
	}
	
	public double getCylinderBore()
	{
		return CylinderBore;
	}
	
	public int getPistonStroke()
	{
		return PistonStroke;
	}
	
	public String getCylinderBlockMaterial()
	{
		return CylinderBlockMaterial;
	}
	
	public String getCylinderHeadMaterial()
	{
		return CylinderHeadMaterial;
	}
	
	public String getValvetrainType()
	{
		return ValvetrainType;
	}
	
	
	public String toString()
	{
		return "Designation: " + Designation + "\n" + 
			   "Manufacturer: "+ Manufacturer + "\n" +
			   "Configuration: " + Configuration + "\n" +
			   "Displacement: " + Displacement + "\n" +
			   "Cylinder Bore: " + CylinderBore + "\n" +
			   "Piston Stroke: " + PistonStroke + "\n" +
			   "Cylinder Block Material: " + CylinderBlockMaterial + "\n" +
			   "Cylinder Head Material: " + CylinderHeadMaterial + "\n" +
			   "Valvetrain Type: " + ValvetrainType;
	}


}
