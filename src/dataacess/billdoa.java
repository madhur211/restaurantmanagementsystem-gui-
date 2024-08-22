package dataacess;

import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Bill;
import model.Product;

/**
 * Class to perform database operations related to bills.
 * This class interacts with the database and handles exceptions.
 * 
 * @author madhurshinde
 */
public class billdoa {
    /**
     * Method to get the next available ID for a bill.
     * 
     * @return the next available bill ID as a String
     */
    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(id) from bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    /**
     * Method to save a bill to the database.
     * 
     * @param bill the Bill object to be saved
     */
public static void save(Bill bill) {
    if (bill.getName() != null) {
        // Proceed with the insertion
        String query = "INSERT INTO bill (id, product_name, quantity, total) VALUES ('" +
                       bill.getId() + "', '" + bill.getName() + "', '" +
                       bill.getQuantity() + "', '" + bill.getTotal() + "')";
        DbOperations.setDataOrDelete(query, "Bill details added successfully!");
    } else {
        // Handle the case where product_name is null
        System.out.println("Error: Product name cannot be null.");
    }
}



    /**
     * Method to retrieve a product by its name from the database.
     * 
     * @param name the name of the product to retrieve
     * @return the Product object corresponding to the name
     */
    public static Product getProductByName(String name) {
        Product product = new Product();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM product WHERE name='" + name + "'");
            while (rs.next()) {
                product.setName(rs.getString(2));
                product.setPrice(rs.getString(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }
    public static ArrayList<Bill> getRecordsByDate(java.util.Date date) {
    ArrayList<Bill> billList = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = sdf.format(date);
    try {
        ResultSet rs = DbOperations.getData("SELECT * FROM bill WHERE DATE(timestamp) = '" + formattedDate + "'");
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setId(rs.getInt("id"));
            bill.setName(rs.getString("product_name"));
            bill.setQuantity(rs.getString("quantity"));
            bill.setTotal(rs.getString("total"));
            bill.setDate(rs.getString("timestamp"));
            billList.add(bill);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return billList;
}
public static ArrayList<Bill> getSumOfQuantitiesForProduct(int month, int year) {
    ArrayList<Bill> billList = new ArrayList<>();
    try {
        String query = "SELECT product_name, SUM(quantity) FROM bill WHERE MONTH(timestamp) = " + month + " AND YEAR(timestamp) = " + year + " GROUP BY product_name";
        
        // Execute the query
        ResultSet rs = DbOperations.getData(query);
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setName(rs.getString("product_name"));
            bill.setQuantity(rs.getString("SUM(quantity)"));
            billList.add(bill);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return billList;
}

public static ArrayList<Bill> getRecordsBetweenDates(java.util.Date startDate, java.util.Date endDate) {
    ArrayList<Bill> billList = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String formattedStartDate = sdf.format(startDate);
    String formattedEndDate = sdf.format(endDate);
    try {
        ResultSet rs = DbOperations.getData("SELECT * FROM bill WHERE DATE(timestamp) BETWEEN '" + formattedStartDate + "' AND '" + formattedEndDate + "'");
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setId(rs.getInt("id"));
            bill.setName(rs.getString("product_name"));
            bill.setQuantity(rs.getString("quantity"));
            bill.setTotal(rs.getString("total"));
            bill.setDate(rs.getString("timestamp"));
            billList.add(bill);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return billList;
}
}
