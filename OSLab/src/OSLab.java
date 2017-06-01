/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jean
 */
public class OSLab {

  
    public static void main(String[] args) {

    Buffer buf = new Buffer();
    
    // create new threads
    Thread prod = new Producer(1,11, buf);
    Thread cons = new Consumer(1,11, buf);
   //hread prod1 = new Producer(2,11,buf);
     //Thread prod2 = new Producer(3,11,buf);
   //Thread cons2 = new Consumer(2,11,buf);
    //Thread cons3 = new Consumer(3,11,buf);
  
    
    // starting threads
    prod.start();
    //prod1.start();
    //prod2.start();
    cons.start();
   //cons2.start();
    //cons3.start();
   // Wait for the threads to finish
    try {
    	prod.join();
        //prod1.join();
        //prod2.join();
    	cons.join();
        //cons2.join();
        //cons3.join();
    } catch (InterruptedException e) {return;}
  }
}

