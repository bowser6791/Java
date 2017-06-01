


public class BridgeProblem {
    public static void main(String[] args) {
              OneLane lane = new OneLane();
                   for (int i = 0; i < 10; i++) {
            if (Math.random() < 0.5) {
	       new SouthBound(lane).start();
            }
	    else {
	       new NorthBound(lane).start();
            }
            try {
                Thread.sleep((int)(Math.random() * 1500));
            } catch (InterruptedException e) {}
        }
    }
}
    

