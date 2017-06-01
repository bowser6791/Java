/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jean
 */
public class Bridge2 {

    public static void main(String[] args) {
        System.out.println("                                            ^^");
               System.out.println("     ^^      ..                                       ..");
               System.out.println("             []                                       []");
               System.out.println("           .:[]:_          ^^                       ,:[]:.");
               System.out.println("         .: :[]: :-.                             ,-: :[]: :.");
               System.out.println("       .: : :[]: : :`._                       ,.': : :[]: : :.");
               System.out.println("     .: : : :[]: : : : :-._               _,-: : : : :[]: : : :.");
              System.out.println(" _..: : : : :[]: : : : : : :-._________.-: : : : : : :[]: : : : :-._");
              System.out.println(" _:_:_:_:_:_:[]:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:[]:_:_:_:_:_:_");
              System.out.println(" !!!!!!!!!!!![]!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!![]!!!!!!!!!!!!!");
               System.out.println(" ^^^^^^^^^^^^[]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^[]^^^^^^^^^^^^^");
               System.out.println("             []                                       []");
               System.out.println("             []                                       []");
               System.out.println("             []                                       []");
               System.out.println("   ~~~~^-~^_~^~^-~^~_~^-~_^~-^~_^~~-^~_~^~-~_~-^~_^~^-~_~^-~~-~~ ");
               System.out.println(" ~ _~~- ~^-^~-^~~- ^~_^-^~~_ -~^_ -~_-~~^- _~~_~-^_ ~^-^~~-_^-~ ~^");
               System.out.println("     ~ ^- _~~_-  ~~ _ ~  ^~  - ~~^ _ -  ^~-  ~ _  ~~^  - ~_   - ~^_~");
               System.out.println("**************************************************************************");
               System.out.println("*                   One Lane Bridge Controller                           *");
               System.out.println("*                       by Jean Armatis                                  *");
               System.out.println("**************************************************************************");
        monitor mon = new monitor();
       for (int i = 0; i < 20; i++) {//The following loop generates random numbers and based on 
                                     //those random numbers either creates car in direction 0 or 1
                                     //20 cars will attempt to cross the bridge in random directions
            if (Math.random() < 0.5) {
	       new OneVehicle(1,mon).start();
            }
	    else {
               new OneVehicle(0,mon).start();
	       
            }
            try {
                Thread.sleep((int)(Math.random() * 1500));//Thread sleep time if it has to wait
            } catch (InterruptedException e) {}
        }
    }
    
}
