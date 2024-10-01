package sales_system;

public class Product {

    private static int productId;
    String name;
    double price;
    public final int id;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.id = ++productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.price;
    }
}
