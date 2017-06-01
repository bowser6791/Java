/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author BoWsER 6791
 */
public class Car {
    String make;
    String color;
    int year;
public Car(){
    make = "Invalid";
    color = "N/A";
    year = 0000;
}
public Car(String newMake,String newColor,int newYear){
    make = newMake;
    color = newColor;
    year = newYear;
}
public String getMake(){
  return make;
    }
public String getColor(){
    return color;
}
public int getYear(){
    return year;
}

}
