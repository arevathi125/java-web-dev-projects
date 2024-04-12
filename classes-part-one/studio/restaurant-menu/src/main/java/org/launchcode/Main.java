//package org.launchcode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem item1 = new MenuItem("Pizza",10.0,"Veg Pizza is delicious!","Main course");
        MenuItem item2 = new MenuItem("Chicken Nuggets",2.0,"Nuggets is Hot and tasty!","Starter");
        MenuItem item3 = new MenuItem("Chocolate cake",5.0,"Cake is Yummy!","Dessert");
        MenuItem item4 = new MenuItem("Birthday cake",5.0,"Cake is Yummy!","Dessert");
        MenuItem item5 = new MenuItem("Birthday cake",5.0,"Cake is Yummy!","Dessert");

        Menu menu = new Menu();
//        Create several items and add them to a menu.
         menu.addItem(item1);
         menu.addItem(item2);
         menu.addItem(item3);
         menu.addItem(item4);
         menu.addItem(item5);

//        Print the entire, updated menu to the screen.
        System.out.println("Items are :" +menu.toString());

//        Print an individual menu item to the screen.
        System.out.println("Item 2 is : "+item1);

//        Delete an item from a menu, then reprint the menu.
//        menu.removeItem(item3);
//        System.out.println(menu.toString());

  //   Test equals method
        System.out.println(item5.equals(item4));
    }
}
