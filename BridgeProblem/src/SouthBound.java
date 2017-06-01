

public class SouthBound extends Thread {
    private OneLane lane;
   
    public SouthBound(OneLane l) {
        lane = l;
    }

    public void run() {
        lane.enter_sb(); 
        lane.CrossBridge("sb");
        lane.leave_sb();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {/* ok to ignore */}
      
    }

}
