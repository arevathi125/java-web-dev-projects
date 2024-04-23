package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        System.out.println("\tFlavor List ");
        System.out.println("Before Sorting: ");

        for (Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }

//        Comparator flavorComparator = new FlavorComparator();
//        flavors.sort(flavorComparator);
         flavors.sort(new FlavorComparator());

        System.out.println("\nAfter Sorting: ");

        for (Flavor flavor: flavors){
            System.out.println(flavor.getName());
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        System.out.println("\tCone List ");
        System.out.println("Before Sorting: ");

        for (Cone cone: cones){
            System.out.println(cone.getName() +": "+cone.getCost());
        }

        Comparator coneComparator = new ConeComparator();
            cones.sort(coneComparator);

          //  cone.sort(new ConeComparator());

        System.out.println("\nAfter Sorting: ");

        for (Cone cone: cones){
            System.out.println(cone.getName()+": "+cone.getCost());
        }
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}