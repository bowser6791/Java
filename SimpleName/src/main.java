import java.util.Scanner;


public class main {

	public static void main(String[] args) {

		Name name = new Name("Jean", "Armatis", "Lee");			//Creates a new instance of the Class simpleName
		
		Name.printSeperator("Name of Person is:");					//Prints Separator defined in simpleName. Since this is a Class method we must use the Class name
																					
		name.printName();													//Print the Last, First, and Middle name to console. Since this is an Instance Method call we use the name of the instance of Class simpleName instead of the Class name itself
																																					
		name.printName("Name of Person is: ");								//Does the same as above with addition of a label added to the beginning of our Print Statement
																			
		Name second_name = new Name();							//The following does the same as the above with the exception that we are now using the Default Constructor
																			
		Name.printSeperator("Name of Person is: ");					//Take note that this call is the same as before since this is a Class Method and is independent of the instance of the Class
																			
		second_name.printName();											
		second_name.printName("Name of Person is: ");
		
		Name third_name = new Name("Erika", "Lopez", "Andrea");	//Using our Class with the addition of the internal Helper Method
		third_name.printNameWithHeading();
		third_name.printNameWithHeading("Name of Person is: ");
		
		Scanner scan = new Scanner(System.in);
		
		
		//Using getter setter methods to print name in whatever format we want
		System.out.println("Please enter first name: ");
		name.setFirstName(scan.next());
		
		System.out.println("Please enter middle name: ");
		name.setMiddleName(scan.next());
		
		System.out.println("Please enter last name: ");
		name.setLastName(scan.next());
		
		
		System.out.println("Name of Person is: " + name.getFirstName() + " " + name.getLastName());
		System.out.println("Name of Person is: " + name.getLastName() + " " + name.getMiddleName() + " " + name.getFirstName());
		
		
	    																	//TO DO get and set Methods
		
																			//Playing around with Dialog boxes will delete this later
		testDialogBox diagBox = new testDialogBox();
		diagBox.showDialog();
		
		scan.close();
		
	}

}
