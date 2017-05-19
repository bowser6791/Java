//**REFERENCE**
//This is a basic example of how a class should be set up

public class simpleName 
{
	// Instance Variables
	String first;	//String container for first name
	String last;	//String container for last name
	String middle;	//String container for middle name
	
	// Class Constants/Fields
	static final String SEPARATOR = ", ";	//This is never going to change hence the static final
	
	// Default Constructor
	public	simpleName()
	{
		//The Constructor sets up our instance variables to a default value
		first 	= "";
		last 	= "";
		middle 	= "";
	}
	
	// Constructor
	public	simpleName(String firstName, String lastName, String middleName)
	{
		//A little different than the default constructor in that it initializes
		//instance variables to the values of parameters 
		first 	= firstName;	
		last 	= lastName;
		middle 	= middleName;
	}
	
	// Class Method to Print Separator
	public static void printSeperator(String label)
	{
		//A Class Method is distinguished by the 'static' modifier. Class Methods have access
		//to Class fields (ones declared 'static' i.e. SEPERATOR, local fields, and parameters.
		//Class Methods cannot access instance fields of Class object (i.e. first,last,middle).
		//Varying access protection (public, private, protected, etc..)
		String message = label + " \"" + SEPARATOR + "\""; 
		System.out.println(message);
	}
	
	// Instance Method to print name with a label
	public void printName(String label)
	{
		//A Instance Method does not include the 'static' modifier.  These methods are typically
		//public allowing code to call this method outside the Class implementation. Instance 
		//Methods have access to both Class (i.e. SEPARATOR) and Instance (i.e. first,last,middle)
		//fields.
		String name = last + SEPARATOR + first + SEPARATOR + middle;
		System.out.println(label + name);
	}

	// Instance Method to print the name without a label
	public void printName()
	{
		System.out.println(last + SEPARATOR + first + SEPARATOR + middle);
	}
	
	// Helper Method to print Heading for Text
	private static void printHeading()
	{
		//Helper Methods are similar to Class Methods with the exception that they must be private to
		//the Class. They are simply helping the Class accomplish something internally rather than
		//complicate the code utilizing the Class (i.e. printing a complex heading
		System.out.println("This is the Heading for Printing out Peoples Names");
		System.out.println("--------------------------------------------------");

	}
	
	// Instance Method to print name with a label plus the heading created above
	public void printNameWithHeading(String label)
	{
		printHeading();
		String name = last + SEPARATOR + first + SEPARATOR + middle;
		System.out.println(label + name);		
	}
	
	// Instance Method to print name without a label plus the heading created above
	public void printNameWithHeading()
	{
		printHeading();
		System.out.println(last + SEPARATOR + first + SEPARATOR + middle);
	}

	
	// End of Class Declaration
}
