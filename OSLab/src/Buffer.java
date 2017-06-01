

import java.util.concurrent.locks.ReentrantLock;
class Buffer {
  		private char contents;
  		private boolean empty = true; 
  		public synchronized void put (int j,char i) throws InterruptedException { 
                  
                 
  			while (empty == false) { 	//wait till the buffer becomes empty
  				try { wait(); }
  				catch (InterruptedException e) {throw e;}
  			}
  			contents = i;
  			empty = false;
  			System.out.println("Producer: "+j+" put..." + i);
  			notify();
                    
  		} 
  		
  		public synchronized int get (int a) throws InterruptedException {
                 
                 
  			while (empty == true)  {	//wait till something appears in the buffer
  				try { 	wait(); }
  				catch (InterruptedException e) {throw e;}
  			}
  			empty = true;
  			notify();
  			char val = contents;
  			System.out.println("Consumer: " + a +" got..." + val);
  			return val;
  		}
}
