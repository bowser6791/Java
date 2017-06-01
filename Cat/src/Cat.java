/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author BoWsER 6791
 */
public class Cat {

  String name;
  String color;
  float weight;
  public Cat()
  {
    name = " ";
    color = " ";
    weight = (float) 0.0;
  }
  public Cat(String newName, String newColor,float newWeight)
  {
    name = newName;
    weight = newWeight;
    color = newColor;
  }
  public String getName()
  {
    return name;
  }public float getWeight()
  {
    return weight;
  }
  public String getColor()
  {
    return color;
  }
}


  

