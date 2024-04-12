import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    //Fields
    private ArrayList<MenuItem> getMenuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //Getters & Setters

    public ArrayList<MenuItem> getGetMenuItems() {
        return getMenuItems;
    }

    @Override
    public String toString() {
        return "getMenuItems=" + getMenuItems ;
    }

    // Add an item
    public void  addItem(MenuItem item){
        getMenuItems.add(item);
    }

//    public void addItems(<ArrayList<ArrayList<MenuItem>>> items){
//        getMenuItems.addAll(items);
//    }

    // Remove an item
    public void removeItem(MenuItem item){
        getMenuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}
