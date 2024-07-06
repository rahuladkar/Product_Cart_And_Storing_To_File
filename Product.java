package Product_Cart_Using_IO_Project;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private String name;
    private double price;
    private int quantity;

    // getter() and setter()
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

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // constructor to initialize the attributes
    Product(String name , double price , int count){
        setName(name);
        setPrice(price);
        setQuantity(count);
    }

    // overridden toString()
    @Override
    public String toString() {
        return "\tname = '" + name + '\'' + "\t\t price = " + price + "\t\t Quantity = " + quantity;
    }

    // overridden compareTo()
    @Override
    public int compareTo(Product o) {
        return this.name.compareTo(o.name);
    }

    // overridden equals()
    @Override
    public boolean equals(Object o) {
        return Objects.equals(name, ((Product)o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }
}
