


public class OSLab2 {
    public static void main(String[] args) throws InterruptedException {
        Bridge brid = new Bridge();
        Thread a = new OneVehicle(0,brid);
        //Thread b = new OneVehicle(0,brid);
        //Thread c = new OneVehicle(0,brid);
        //Thread d = new OneVehicle(1,brid);
        //Thread f = new OneVehicle(1,brid);
        //Thread g = new OneVehicle(0,brid);
        //Thread h = new OneVehicle(1,brid);
        //Thread i = new OneVehicle(1,brid);
        //Thread j = new OneVehicle(0,brid);
        //Thread k = new OneVehicle(1,brid);
        a.start();
        //b.start();
        //c.start();
        //d.start();
        //f.start();
        //g.start();
        //h.start();
        //i.start();
        //j.start();
        //k.start();
       
  try {
    	a.join();
        //b.join();
        //c.join();
        //d.join();
        //f.join();
        //g.join();
        //h.join();
        //i.join();
        //j.join();
        //k.join();
    } catch (InterruptedException e) {return;}
       

    }
}
