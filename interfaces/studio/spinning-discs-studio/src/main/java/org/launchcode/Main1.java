package org.launchcode;

public class Main1 {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD("Harry Potter");
        DVD myDVD = new DVD("Narnia Returns");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.spinDisc();
        myDVD.spinDisc();

        myCD.writeData("More data to write");
        myDVD.writeData("We can erase and rewrite");

        System.out.println(myCD.getInfo());
        System.out.println(myDVD.getInfo());
    }
}