/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;
public class Main {

 
    public static void main(String[] args) {
        //Exercise1
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("*  I meant what I said      *");
        System.out.println("*  and I said what I meant  *");
        System.out.println("*  An elephant's faithful   *");
        System.out.println("*  one hundred percent      *");
        System.out.println("* * * * * * * * * * * * * * *");
        //Exercise2
        System.out.println("");
        System.out.println("CS101:Introduction to Computerr Science");
        System.out.println("");
        System.out.println("      Lab 1:Inputs and Outputs");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Name:Jean Armatis");
        System.out.println("ID# 0887173");
        System.out.println("Professor: Julius Dichter");
        System.out.println("Date: September 24, 2010");
        //Exercise3
        String FirstName;
        String LastName;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your first name:");
        FirstName=in.nextLine();
        System.out.println("Please enter your last name:");
        LastName=in.nextLine();
        System.out.println("Happy Birthday "+ FirstName+" "+LastName);
        //Exercise4
        System.out.println(LastName+", "+LastName);
        System.out.println("September:24:2010");
        //Exercise5
        System.out.println("Enter your full name: ");
        String Name;
        Name=in.nextLine();
        System.out.println("Your name is: " +Name);
        int chars=Name.length();
        System.out.println("The number of Characters are: "+chars);
    }
  
        
   
    

}
