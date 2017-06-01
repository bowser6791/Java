/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Jean
 */
public class Rational implements Comparable {
private int num;
private int denom;
public Rational(int num, int den){
    this.num=num;
    this.denom=den;
}
public int compareTo(Object o){
    if(!(o instanceof Rational))
        return 0;
    Rational r = (Rational)o;
    if((double)num/denom>(double)r.num/r.denom)
        return 1;
    if((double)num/denom<(double)r.num/r.denom)
        return -1;
    else
        return 0;
}
public String toString(){
    return ""+num + "/" +denom;
}



}
