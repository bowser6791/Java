/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Animals
{

public static void main(String[] args) 
{
	Animal a1 = new Animal("nothing");
	Cat    c1 = new Cat();
	Dog    d1 = new Dog();

	a1.speak();
	c1.speak();
	d1.speak();

	for(int i = 0; i < 3; i++)
		c1.kill();

	d1.train();

	Animal [] zoo = new Animal[6];

	zoo[0] = a1;
	zoo[1] = d1;
	zoo[2] = c1;

	zoo[3] = new Cat();
	zoo[4] = new Cat();
	zoo[5] = new Dog();


	for(int i = 0; i < zoo.length; i++)
		System.out.println(zoo[i]);





}

} // Animals

