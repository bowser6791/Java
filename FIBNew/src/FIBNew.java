/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
public class FIBNew {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
    }
    public static long recFibN(final int n)
{
 return (n < 2) ? n : recFibN(n - 1) + recFibN(n - 2);
}
}
