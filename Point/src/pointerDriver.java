
public class pointerDriver {
    public static void main(String[] args) {
        Point myPoint1 = new Point();

        System.out.println("Y coordinate of point 1: " + myPoint1.getX());
        System.out.println("Y coordinate of Point 1: " + myPoint1.getY());
        System.out.println("Point 1: " + myPoint1.toString() + "\n");
        myPoint1.setPoint(4, 6);
        System.out.println("New points");
        System.out.println("X coordinate of Point 1: " + myPoint1.getX());
        System.out.println("Y coordinate of Point 1: " + myPoint1.getY());
        System.out.println("Point 1: " + myPoint1.toString() + "\n");
        Point myPoint2 = new Point(6, 9);
        System.out.println("X coordinate of Point 2: " + myPoint2.getX());
        System.out.println("Y coordinate of Point 2: " + myPoint1.getY());
        System.out.println("Point 2: " + myPoint2.toString() + "\n");
        System.out.println("Distance between Point 1 and Point 2 = "+myPoint2.dist(myPoint1));

}
}
