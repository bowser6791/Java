


public class Main {
  public static < E > void printArray( E[] myArray )
     {
        
        for ( E element : myArray )
           System.out.printf( element.toString() + "");
  
        System.out.println();
     }
  public static <F> void printArrays(F[]a,F[]b,F[]c,F[]d){

     for ( F element : a )
           System.out.printf( element.toString() + " ");
     for (F element:b)
          System.out.printf(element.toString()+" ");
     for(F element:c)
          System.out.printf(element.toString()+" ");
     for(F element:d)
          System.out.printf(element.toString()+" ");
      System.out.println("\n");
  }

     public static void main( String args[] )
     {
       
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        Person[]personArray={new Person("Sam "," Colt "),new Person("Ed "," Bart "),new Person("Ted "," Alex")};

        System.out.println( "Array integerArray contains:" );
        printArray( intArray );
         System.out.println( "\nArray doubleArray contains:" );
         printArray( doubleArray );
         System.out.println( "\nArray characterArray contains:" );
         printArray( charArray ); 
         System.out.println("\nArray personArray contains:");
         printArray(personArray);
         System.out.println("\nArray stringArray contaims:");
         printArrays(intArray,doubleArray,charArray,personArray);
         


    }

}
