package org.launchcode;
import java.util.Scanner;

public class BonusPart2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle : ");
        double radius = input.nextDouble();
        while( radius < 0){
            System.out.println("Please enter a Positive number ");
             radius = input.nextDouble();
        }
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is : " + area);

    }
}
