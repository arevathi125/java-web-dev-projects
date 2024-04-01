package org.launchcode;
import java.util.Scanner;

public class AreOFARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle : ");
        double width = input.nextDouble();
        input.close();
        double areaOfRectangle = length * width;
        System.out.println("Area of the rectangle : " + areaOfRectangle);

    }
}
