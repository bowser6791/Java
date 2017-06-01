/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author BoWsER 6791
 */
public class Main {

    /**
     * @param args the command line arguments
     */public static int[]a = new int[8];
       
    public static void main(String[] args) {
        
        for(int i = 0;i<a.length;i++){
            a[i]=(i+1)*2;
        System.out.println(a[i] );
        
        
}
        double avg = getAvg(a);
        System.out.println("avg = "+avg);
        double max = getMax(a);
        System.out.println("max = "+max);
        double min = getMin(a);
        System.out.println("min = "+min);
}


    public static int getAvg(int[]x){
        int sum =0;
        for(int i= 0;i<x.length;i++)
            sum+=  x[i];
          return (sum /x.length);
    }
    public static int getMax(int[]x){
        int big = x[0];
        for(int i = 1;i<x.length;i++){
            if(x[i]>big)
                big = x[i];
        }
        return big;
    }
    public static int getMin(int[]x){
        int small = x[0];
          for(int i = 1;i<x.length;i++){
            if(x[i]<small)
                small = x[i];
        }
        return small;
    }
}

