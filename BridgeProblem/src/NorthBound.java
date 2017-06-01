

public class NorthBound extends Thread {
    private OneLane lane;
   
    public NorthBound(OneLane l) {
        lane = l;
       
    }

   public void run() {
        
    lane.enter_nb(); 
    lane.CrossBridge("nb");
    lane.leave_nb();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {/* ok to ignore */}
       
        
       
    
 }

}
