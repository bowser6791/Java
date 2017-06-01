

public class OneVehicle extends Thread {//Simply a thread to invoke the ArriveBridge,
    private int direction;              //CrossBridge, and ExitBridge methods
    private monitor mon;
    public OneVehicle(int a,monitor m){
        mon = m;
        direction=a;
    }
public void run(){
    mon.ArriveBridge(direction);//Method is called to indicate a car has arrived
    mon.CrossBridge(direction);//Method is called to indicate a car is crossing
    mon.ExitBridge(direction);//Method is called to indicate a car is exiting the bridge
   try {
            Thread.sleep(100);
        } catch (InterruptedException e) {/* ok to ignore */}
}
    
}

