/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class CatDriver {
  public static void main (String[] args)
  {
    Cat myCat1 = new Cat("Billy","brown", (float) 100.6);
    Cat myCat = new Cat("Meow", "ginger", (float) 10.5);
    Cat cat = new Cat();
    System.out.print("myCat  ");
    System.out.println(myCat.getName() + " " +
       myCat.getColor() + " " + myCat.getWeight());
    System.out.print("cat  ");
    System.out.println(cat.getName() + " " +
      cat.getColor() + " " + cat.getWeight());
    System.out.print("myCat1  ");
    System.out.println(myCat1.getName() + " " +
       myCat1.getColor() + " " + myCat1.getWeight());
  }

}
