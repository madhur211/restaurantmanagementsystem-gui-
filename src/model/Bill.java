package model;

import java.util.ArrayList;

/**
 * Represents a bill entity.
 * Stores information about a product purchase.
 * 
 * @author madhurshinde
 */
public class Bill {
    private int id;
    private String name; // Change product_name to name
    private String quantity;
    private String total;
    private String date;
    private ArrayList<String> productNames;
    private ArrayList<Integer> quantities;

    // Constructor
    public Bill() {
        productNames = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    // Getters and setters
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() { // Getter for product name
        return name;
    }

    public void setName(String name) { // Setter for product name
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    public ArrayList<String> getProductNames() {
        return productNames;
    }

    public ArrayList<Integer> getQuantities() {
        return quantities;
    }

    // Method to add a product with its quantity to the bill
    public void addProduct(String productName, int quantity) {
        productNames.add(productName);
        quantities.add(quantity);
    }
}
