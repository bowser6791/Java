/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class Entry {
public static String Last,Middle,First,Street,City,State,Zip,AreaCode,Exchange,Number;

    public Entry(String L,String M,String F,String S,String C,String ST,String Z,String A,String E,String N){
        Last = L;
        Middle = M;
        First = F;
        Street = S;
        City = C;
        State = ST;
        Zip = Z;
        AreaCode = A;
        Exchange = E;
        Number = N;
}

    public static String getName(){
        return Last;
    }
    public static String getAreaCode(){
        return AreaCode;
    }
    public static String getZip(){
        return Zip;
    }

}

