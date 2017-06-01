


public class Consumer extends Thread {//This class will extend Thread class
  	private int n;//# of times thread will attempt to consume
        private int id;//identifier
  	private Buffer consBuf;//initialize Buffer for Consumer
  	
  	public Consumer (int q,int m, Buffer buf) {//takes in 3 arguments, passes them to n,id,prodBuf
  		n = m;
                id = q;
  		consBuf = buf;
    }
    
    public void run() {//the run constructor for this Thread
    	int value;
    	for (int i = 0; i < n; i++) {//Loop and sleep
    		try {
    			value = consBuf.get(id);
    		}  catch (InterruptedException e) {return;}
    		try {
    			Thread.sleep(10); // sleep for a randomly chosen time
    		} catch (InterruptedException e) {return;}
    		
    	}
    }
  }
