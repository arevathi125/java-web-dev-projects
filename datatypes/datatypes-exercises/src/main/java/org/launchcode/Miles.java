package org.launchcode;
import  java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles : ");
        int numberOfMiles = input.nextInt();
        System.out.println("Enter the amount of gas : ");
        double amountOfGas = input.nextDouble();

        double milesPerGallon = numberOfMiles / amountOfGas;
        System.out.println("You are running on " + milesPerGallon + "mpg.");
    }
}
