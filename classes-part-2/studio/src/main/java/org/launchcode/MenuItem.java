package launchcode;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private final LocalDate dateUpdated;

    public MenuItem(String n, double p, String d, String c) {
        this.name = n;
        this.price = p;
        this.description = d;
        this.category = c;
        this.dateUpdated = LocalDate.now();
    }

    public String getName() {
        return name;
    }

       public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateUpdated() {
        return dateAdded;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", dateUpdated=" + dateUpdated +
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
        return item.getCategory() == getCategory();
    }
}

