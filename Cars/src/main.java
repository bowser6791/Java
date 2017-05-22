import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car;
		Engine engine;
		Transmission transmission;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("-                             Car Information                                    -");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Please enter the Car's Year: ");
		String year = scan.next();
		
		System.out.println("Please enter the Car's Make: ");
		String make = scan.next();
		
		System.out.println("Please enter the Car's Model: ");
		String model = scan.next();
		
		System.out.println("Please enter the Car's Color: ");
		String color = scan.next();
		
		System.out.println("Please enter the Car's Body Style: ");
		String bodystyle = scan.next();
		
		System.out.println("Please enter the Car's Mileage: ");
		int mileage = scan.nextInt();
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("-                             Engine Information                                 -");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Please enter Engine's Designation (i.e. EJ257): ");
		String designation = scan.next();
		
		System.out.println("Please enter Engine's Manufacturer (i.e. Toyota): ");
		String manufacturer = scan.next();
		
		System.out.println("Please enter Engine's Configuration (i.e. V8): ");
		String configuration = scan.next();
		
		System.out.println("Please enter Engine's Displacement in Cubic Centimeters (i.e. 4807): ");
		int displacement = scan.nextInt();
		
		System.out.println("Please enter Engine's Cylinder Bore in millimeters (i.e. 96.01): ");
		double cylinderBore = scan.nextDouble();
		
		System.out.println("Please enter Engine's Piston Stroke in millimeters (i.e. 83): ");
		int pistonStroke = scan.nextInt();
		
		System.out.println("Please enter Engine's Cylinder Block Material (i.e. Aluminum): ");
		String cylinderBlockMaterial = scan.next();
		
		System.out.println("Please enter Engine's Cylinder Head Material (i.e. Cast Iron): ");
		String cylinderHeadMaterial = scan.next();
		
		System.out.println("Please enter Engine's Valvetrain Type (i.e. OHV): ");
		String valvetrainType = scan.next();
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("-                         Transmission Information                               -");
		System.out.println("----------------------------------------------------------------------------------");
		
		System.out.println("1st Gear Ratio?: ");
		double first = scan.nextDouble();
		
		System.out.println("2nd Gear Ratio?: ");
		double second = scan.nextDouble();
		
		System.out.println("3rd Gear Ratio?: ");
		double third = scan.nextDouble();
		
		System.out.println("4th Gear Ratio?: ");
		double fourth = scan.nextDouble();
		
		System.out.println("5th Gear Ratio?: ");
		double fifth = scan.nextDouble();
		
		System.out.println("6th Gear Ratio?: ");
		double sixth = scan.nextDouble();
		
		//engine = new Engine(designation, manufacturer, configuration, displacement, cylinderBore, pistonStroke, cylinderBlockMaterial, cylinderHeadMaterial, valvetrainType);
		
		System.out.println();
		
		//transmission = new Transmission(first, second, third, fourth, fifth, sixth);
		
		
		//System.out.println(engine);
		//System.out.println(transmission);
		
		car = new Car(year,make,model,color,color,mileage,
			  new Engine(designation, manufacturer, configuration, displacement, cylinderBore, pistonStroke, cylinderBlockMaterial, cylinderHeadMaterial, valvetrainType),
		      new Transmission(first, second, third, fourth, fifth, sixth));
		
		//A couple of ways to access the data
		
		//Using the toString method of Cars we get everything
		System.out.println("Accessing all the data at once within car");
		System.out.println(car + "\n");
		
		//Using the toString method of Engine with car as our container we can get just the engine info
		System.out.println("Accessing engine data from within car container class");
		System.out.println(car.engine + "\n");
		
		//Using the toString method of Transmission with car as our container we can get just the trans info
		System.out.println("Accessing transmission data from within car container class");
		System.out.println(car.transmission);
	}

}
