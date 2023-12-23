import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class MyApplication {
    public static void main(String[] args) {
        Point point1 = new Point(3.4);
        Point point2 = new Point(1.2);
        Point point3 = new Point(4.5);

        Point[] ShapePoints = {point1, point2, point3};
        Shape shape = new Shape(ShapePoints);

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("LongestSide:  " + shape.longestSide());
        System.out.println("AverageSide:  " + shape.averageSide());
    }
}
