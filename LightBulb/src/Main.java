/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class Main {

    public static void main(String[] args) {
LightBulb bulb = new LightBulb();
System.out.println("Is the bulb on?"  + bulb.isOn());
bulb.switchit();
System.out.println("Is the bulb on? " + bulb.isOn());
bulb.switchit();
System.out.println("Is the bulb on? " + bulb.isOn());
bulb.switchit();
System.out.println("Is the bulb on? " + bulb.isOn());

    }

}
