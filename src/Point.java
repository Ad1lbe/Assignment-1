import models.*;



public class Point {
    private double x;
    private double y;


// Constructor
    public Point(double x, double) {
    this.x = x;
    this.y = y;
}

// Distance between current point to destination point
public double distanceTo(Point destination) {
    double delX = this.x - destination.x;
    double delY = this.y - destination.y;

    return Math.sqrt(delX * delX + delY * delY);
}


