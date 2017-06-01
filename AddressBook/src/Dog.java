/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Dog extends Animal
{

private boolean guide;

public Dog()
{
  super("Bow Wow");
  guide = false;
}

public String toString()
{
  return "I am a dog, guide status: " + guide;
}

public void train()
{
  guide = true;
}

public boolean isGuide()
{
  return guide;
}


}

