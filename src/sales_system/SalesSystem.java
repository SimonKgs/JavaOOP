package sales_system;

import java.util.ArrayList;
import java.util.Arrays;

public class SalesSystem {

    public static void main(String[] args) {

        // creating some products
        Product oil = new Product("Oil", 20.50);
        Product cereal = new Product("Cereal", 3.2);
        Product wine = new Product("Wine", 8);

        // initializing the order with some values on the arraylist
        Order order1 = new Order(new ArrayList<>(Arrays.asList(
                oil,
                cereal,
                wine
        )));

        // using methods
        System.out.println("Order: " + order1.id);
        order1.showOrder();
        System.out.println("=================");
        System.out.printf("Total: %.2f € \n", order1.calcTotal());
        System.out.println("=================");


        // order2 this time initialize it as an empty array list and add products later
        // <Product>
        Order order2 = new Order(new ArrayList<>());
        // using add product
        order2.addProduct(cereal);
        order2.addProduct(cereal);
        order2.addProduct(cereal);
        // this remove as it is implemented will remove the first occurrence of cereal on the arrayList
        order2.removeProduct(cereal);
        order2.addProduct(oil);
        order2.addProduct(wine);
        order2.addProduct(wine);
        order2.addProduct(new Product("Water", 2.00));

        // showing order2
        System.out.println();
        System.out.println("Order: " + order2.id);
        order2.showOrder();
        System.out.println("=================");
        System.out.printf("Total: %.2f € \n", order2.calcTotal());
        System.out.println("=================");

    }
}
