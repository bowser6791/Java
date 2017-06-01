/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author BoWsER 6791
 */
public class Main {

    public static void main(String[] args) {
      int[] myArray = {4,7,6,8,2,4,3,5,9,6,7,22,35,67,1,-8,9,-45,2,6,7,56,456,3,569,5,3,4,2,7,5,8,7,4,5,2,1};
     
      bubbleSort(myArray);
      printArray(myArray);
      System.out.println();
    }
public static void bubbleSort(int[]x){
    int n = x.length;
    for(int pass = 1;pass<n;pass++){
        for(int i=0;i<n-pass;i++){
        if(x[i]>x[i + 1]){
            int temporary = x[i];
            x[i] =x[i+1];
            x[i + 1]=temporary;
        }
    }
}
}
public static void printArray(int[]a){
    for(int i = 0;i<a.length;i++){
        if(i != 0 && i % 10==0){
            System.out.println();
        }
        System.out.printf("%6d",a[i]);
}
    System.out.println();
}
}
