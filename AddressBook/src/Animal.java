


public class Animal
{

private String sound;

public Animal(String sound)
{
  this.sound = sound;
}

public void speak()
{
  System.out.println(sound);
}

public String toString()
{
  return "I am a generic Animal";
}

}