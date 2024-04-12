import java.time.LocalDate;

public class MenuItem {

    //Fields
    private String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate dateAdded;

    //Constructor

    public MenuItem(String aName, double aPrice, String aDescription, String aCategory){
        name = aName;
        price = aPrice;
        description = aDescription;
        category = aCategory;
        dateAdded = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return  "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", dateAdded=" + dateAdded +
                '}';
    }

    public boolean equals(Object toBeCompared){
        if (toBeCompared == this){
            return true;
        }
        if (toBeCompared == null){
            return false;
        }
        if (getClass() != toBeCompared.getClass()){
            return false;
        }
        MenuItem item = (MenuItem) toBeCompared;
        return item.getCategory() == getCategory() && item.getName() == item.getName();
    }
}
