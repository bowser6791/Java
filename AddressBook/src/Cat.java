/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Cat extends Animal
{

private int lives;

public Cat()
{
  super("Meow");
  lives = 9;
}

public String toString()
{
  return "I am a cat, I have " + lives + " lives left";
}

public void kill()
{
  if (lives > 0)
    lives --;
}

public boolean isDead()
{
  return lives == 0;
}


}
