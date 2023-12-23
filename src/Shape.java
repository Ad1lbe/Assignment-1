
package models;

public class Shape {
    private Point[] points;


public Shape(Point[] points) {
    this.points = points;
}

// Finding perimeter
public double perimeter() {
    double perimeter = 0;

    for(int i = 0; i < points.length - 1; i++) {
        perimeter += points[i].distanceTo(points[i + 1]);
    }

    perimeter += points[points.length - 1].distanceTo(points[0]);

    return perimeter;
}

// Finding longest side
public double longestSide() {
    double longest = 0;

    for (int i = 0; i < points.length - 1; i++) {
        double sideLength = points[i].distanceTo(points[i + 1]);
        if (sideLength > longest) {
            longest = sideLength;
        }
    }
    longest = Math.max(longest, perimeter());
    return longest;
}

// Finding average side
public double averageSide() {
    double total = 0;
    for(int i = 0; i < points.length - 1; i++) {
       total += points[i].distanceTo(points[i + 1]);
    }
    total += points[points.length - 1].distanceTo(points[0]);

    return total / points.length;
}


