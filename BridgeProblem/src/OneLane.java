/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jean
 */
public class OneLane {
    int nb; // northbound cars on bridge 
     int sb; // southbound cars on bridge 
   
    synchronized public void enter_sb() {
        while (nb != 0) {
            try {
                wait();
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        sb++;
        notifyAll();
        System.out.println("sb car has entered: " + sb + " southbound car on lane");
    }
   
    synchronized public void leave_sb() {
        while (sb == 0) {
            try {
                wait();
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        sb--;
        System.out.println("sb car has left: " + sb + " southbound cars on lane");
        if (sb == 0) {
            notifyAll();
        }
    }

    synchronized public void enter_nb() {
        while (sb != 0) {
            try {
                wait();
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        nb++;
        notifyAll();
        System.out.println("nb has entered: " + nb + " northbound car on lane");
    }
   
    synchronized public void leave_nb() {
        while (nb == 0) {
            try {
                wait();
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        nb--;
        System.out.println("nb car has left: " + nb + " northbound cars on lane");
        if (nb == 0) {
            notifyAll();
        }
    }
    public void CrossBridge(String a){
        if("nb".equals(a)){
            System.out.println("That car is crossing northbound");
        }else
            if("sb".equals(a)){
                System.out.println("That car is crossing southbound");
            }
    }
}