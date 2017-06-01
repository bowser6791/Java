/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jean
 */
public class Producer extends Thread { //This class will extend Thread class
  	private int n; //# of times thread will attempt to produce
        private int id; //identifier
  	private Buffer prodBuf; //initialize Buffer for Producer
        String ca = "Hello World"; //initisalize the String we will work with
        char[] content = ca.toCharArray(); //convert to Char array
  	
  	public Producer (int q,int m, Buffer buf) { //takes in 3 arguments, passes them to n,id,prodBuf
  		n = m;
                id = q;
  		prodBuf = buf;
    }
    
    public void run() {//the run constructor for this Thread
    	for (int i = 0; i < n; i++) {//Loop and sleep
    		try {
    			Thread.sleep( 10); // sleep for a randomly chosen time
    		} catch (InterruptedException e) {return;}
    		
    	    try {
    	    	prodBuf.put(id,content[i]); //starting from 1, not 0
    	    } catch (InterruptedException e) {return;}
    		
    	}
    }
  }
