


public class Bridge  {
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
        System.out.println("sb enter: " + sb + " southbound cars on lane");
    }
   
    synchronized public void leave_sb() {
        while (sb == 0) {
            try {
                wait();
           } catch (InterruptedException ie) {/* ok to ignore */}
        }
        sb--;
        System.out.println("sb leave: " + sb + " southbound cars on lane");
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
        System.out.println("nb enter: " + nb + " northbound cars on lane");
   }
   
    synchronized public void leave_nb() {
        while (nb == 0) {
            try {
                wait();
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        nb--;
        System.out.println("nb leave: " + nb + " northbound cars on lane");
        if (nb == 0) {
            notifyAll();
       }
    }
    //synchronized public void ArriveBridge(int direc){
      //  if(direc==0){
        //      while (nb != 0) {
          //  try {
            //    wait();
        //    } catch (InterruptedException ie) {/* ok to ignore */}
       // }
        //sb++;
        //notifyAll();
       // System.out.println("sb enter: " + sb + " southbound cars on lane");
       // }else if(direc==1){
         //     while (sb != 0) {
           // try {
             //   wait();
           // } catch (InterruptedException ie) {/* ok to ignore */}
       /// }
        //nb++;
        //notifyAll();
        //System.out.println("nb enter: " + nb + " northbound cars on lane");
       // }
        
    //}
    //synchronized public void ExitBridge(int direc){
        //if(direc==0){
          //    while (nb == 0) {
            //try {
              //  wait();
           // } catch (InterruptedException ie) {/* ok to ignore */}
       // }
       // nb--;
       // System.out.println("nb leave: " + nb + " northbound cars on lane");
       // if (nb == 0) {
          //  notifyAll();
       // }  
       // }else if(direc==1){
         //         while (sb == 0) {
           // try {
             //   wait();
            //} catch (InterruptedException ie) {/* ok to ignore */}
       // }
       // sb--;
       // System.out.println("sb leave: " + sb + " southbound cars on lane");
       // if (sb == 0) {
         //   notifyAll();
        //}
        //}
   // }
}

       
  		




    

