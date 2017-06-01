

public class OneVehicle extends Thread {
  	private int n;
  	private Bridge brdg;
  	
  	public OneVehicle (int q, Bridge buf) {
  		n = q;
  		brdg = buf;
    }
    
    public void run(){
        if(n==0){
     brdg.enter_nb();
     brdg.leave_sb();
        }else if(n==1){
            brdg.enter_sb();
            brdg.leave_sb();
        }    	
    			//brdg.ArriveBridge(n);
                       //brdg.CrossBridge(n);
                       //brdg.ExitBridge(n);
                       
               
    		try {
    			Thread.sleep(1); // sleep for a randomly chosen time
    		} catch (InterruptedException e) {return;}
    }
  }

