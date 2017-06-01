/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jean
 */
public class SingleLaneBridge {

    private static void nap(int ms) {
	try {
	    Thread.sleep(ms);
	} catch (InterruptedException e) {}
    }


    public static void main(String[] a) {
	final CarWindow win = new CarWindow();

	win.pack();
	win.setVisible(true);

	new Thread(new Runnable() {
		public void run() {
		    while (true) {
			nap(25);
			win.repaint();
		    }
		}
	    }).start();



    }

}
