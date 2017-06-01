/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class CarDriver {
    public static void main(String[] args) {
        Car car1 = new Car("Ford","Red",1996);
        Car car2 = new Car("Bugatti","Black",2011);
        Car car3 = new Car("Nissan","Silver",1998);
        System.out.print("Car1= ");
        System.out.println(car1.getMake()+", " + car1.getColor() + ", " + car1.getYear());
        System.out.println(car2.getMake()+", " + car2.getColor() + ", " + car2.getYear());
        System.out.println(car3.getMake()+", " + car3.getColor() + ", " + car3.getYear());
    }

    }

