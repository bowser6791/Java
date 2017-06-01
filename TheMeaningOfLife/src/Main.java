


import java.util.Scanner;
import java.util.Calendar;
public class Main {
    private static Scanner in = new Scanner(System.in);
      public static void main(String[] args) {
          
          Calendar calendar = Calendar.getInstance();
          System.out.println("What year is it?");
          int year = in.nextInt() ;
          int month = Calendar.FEBRUARY;
          int date = 1;
          calendar.set(year, month, date);
          int numOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
          int numOfWeeksInMonth = calendar.getActualMaximum(Calendar.WEEK_OF_MONTH);
          System.out.println("Number of Days In Month: " + numOfDaysInMonth);
          System.out.println("Number of Weeks In Month: " + numOfWeeksInMonth);

}

}

             


       



      
    }

}
