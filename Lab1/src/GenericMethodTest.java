/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class GenericMethodTest {
  
      public static < E > void printArray( E[] myArray )
     {
        // display array elements              
        for ( E element : myArray )         
           
  
        System.out.println();
     } // end method printArray
  
     public static void main( String args[] ) 
     {
        // create arrays of Integer, Double and Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
  
        System.out.println( "Array integerArray contains:" );
        printArray( intArray ); // pass an Integer array
         System.out.println( "\nArray doubleArray contains:" );
         printArray( doubleArray ); // pass a Double array
         System.out.println( "\nArray characterArray contains:" );
         printArray( charArray ); // pass a Character array
 
    }

}
