package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radius = input.nextDouble();
        input.close();
         // double area = 3.14 * radius * radius;
        double area = Circle.getArea(radius);
        //Object
//        Circle obj = new Circle();
//        double area = obj.getArea(radius);
        System.out.println("The area of a circle of radius "+radius+ " is : "+area);

    }
}
