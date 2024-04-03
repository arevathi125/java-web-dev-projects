package org.launchcode;
import java.util.Scanner;

public class BonusPart1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        if(input.hasNextDouble()) {
            double radius = input.nextDouble();

            if (radius > 0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is : " + area);
            } else {
                System.out.println("Please enter a valid input");
            }
        }
        else{
            System.out.println("Please give some input");
        }
        input.close();
    }
}
