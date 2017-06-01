/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author BoWsER 6791
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarInformation();
        System.out.println("");
        System.out.println("");
        CarInformation();
    }
    public static void CarInformation (){
        String CarMake;
        String CarModel;
        String CarYear;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter car make: ");
        CarMake = in.nextLine();
        System.out.println("Enter car model: ");
        CarModel = in.nextLine();
        System.out.println("Enter car year: ");
        CarYear = in.nextLine();
        System.out.println("**********************");
        System.out.println("*  Car Information:  *");
        System.out.println("*    Make: " + CarMake+"    *");
        System.out.println("*    Model: " + CarModel +"    *");
        System.out.println("*    Year: " + CarYear +"      *");
        System.out.println("**********************");
        
        
        
    }

}
