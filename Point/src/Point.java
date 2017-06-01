

public class Point {
    private int X;
    private int Y;
    private int ss;
    private int SS;
    public Point(){
        X = 0;
        Y = 0;
    }
    public Point(int A, int B){
        X = A;
        Y = B;
    }
    public void setPoint(int a, int b){
         X = a;
         Y= b;
    }
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }
    @Override
    public String toString(){
        return "["+ X +","+ Y +"]";
    }
    public double distToOrigin(){
        int ss = X*X + Y*Y;
        return Math.sqrt(ss);
    }
    public double dist(Point p){
        int SS = (X-p.X)*(X-p.X)+
                (Y-p.Y)*(Y-p.Y);
        return Math.sqrt(SS);
    }

}
