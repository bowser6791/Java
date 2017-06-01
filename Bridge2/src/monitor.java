
public class monitor {
   int zero; //semaphore for counting how many cars travelling direction 0
     int one; //semaphore for counting how many cars are travelling direction 1
   synchronized public void ArriveBridge(int a){ //Car arrives at bridge
       if(a==0){ //If its direction is 0 first the bridge is checked to see if another car is coming
           while (one != 0) {//if it is it makes that car wait
            try {
                wait();
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        zero++;
        notifyAll();//until the bridge is clear then allows the car to go
        System.out.println("A car going in direction 0 has entered: " + zero + " car on lane");
       }else 
           if(a==1){//If its direction is 1 first the bridge is checked to see if another car is coming
              while (zero != 0) {//if it is it waits
            try {
                wait();
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        one++;//until the bridge is clear then allows it to go
        notifyAll();
        System.out.println("A car going in direction 1 has entered: " + one + " car on lane"); 
           }
   }
   synchronized public void ExitBridge(int a){
       if(a==0){//If car is attempting to exit 
         while (zero == 0) {//The bridge is checked to see if another car is exiting in the other direction
            try {
                wait();//if there is it waits
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        zero--;
        System.out.println("Car going in direction 0 has left: " + zero + " cars on lane");
        if (zero == 0) {
            notifyAll();//if not it exits
        }   
       }else
           if(a==1){//same concept as previous lines except direction 1 is considered
                     while (one == 0) {
            try {
                wait();
            } catch (InterruptedException ie) {/* ok to ignore */}
        }
        one--;
        System.out.println("Car going in direction 1 has left " + one + " cars on lane");
        if (one == 0) {
            notifyAll();
        }
           }
   }
   
    public void CrossBridge(int b){//This method simply prints the following debug messages
        if(b==0){//Letting the viewer know that the signal has been received and the car is now crossing
            System.out.println("That car is crossing in direction 0");
        }else
            if(b==1){
                System.out.println("That car is crossing in direction 1");
            }
    }
}
