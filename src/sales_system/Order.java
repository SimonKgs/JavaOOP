package sales_system;

import java.util.ArrayList;

public class Order {

    private static int orderId = 0;
    private ArrayList<Product> products;
    public int id;

    // Constructor that accepts an ArrayList<Product>
    public Order(ArrayList<Product> products) {
        // Initialize the 'products' with the passed ArrayList
        // If null is passed, initialize it to an empty ArrayList
        this.products = (products != null) ? products : new ArrayList<>();
        this.id = ++orderId;
    }

    public double calcTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }

    public void showOrder() {
        if (products.isEmpty()) System.out.println("The cart is empty");
        else {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        if (this.products.remove(product)) {
            System.out.println("Product removed: " + product);
        } else {
            System.out.println("Product not found in the order.");
        }
    }

}
