/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataacess;

import javax.swing.JOptionPane;

/**
 *
 * @author madhurshinde
 */
public class tables {
    public static void main(String[] args){
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),address varchar(200),password varchar(20),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
            
            String productTable="create table product(id int AUTO_INCREMENT primary key,name varchar(200),price varchar(200))";
                 /*String salesTable = "CREATE TABLE sales (" +
                                    "bill_id INT AUTO_INCREMENT PRIMARY KEY," +
                                    "product_id INT," +
                                    "quantity INT," +
                                    "total DECIMAL(10, 2)," +
                                    "timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                                    ")";*/
                 String billTable = "CREATE TABLE IF NOT EXISTS bill (" +
                        "id INT AUTO_INCREMENT PRIMARY KEY," +
                        "product_name VARCHAR(200)," + // Change from product_id INT to product_name VARCHAR
                        "quantity INT," +
                        "total DECIMAL(10, 2)," +
                        "timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                    ")";
// Execute the table creation query for bill
DbOperations.setDataOrDelete(billTable, "Bill Table Created Successfully");
         // Calculate total quantities and sales for each product at the end of the day
String dailySalesQuery = "SELECT " +
                            "product_name," + // Change from product_id
                            "SUM(quantity) AS total_quantity," +
                            "SUM(total) AS total_sales " +
                         "FROM " +
                            "sales " +
                         "WHERE " +
                            "DATE(timestamp) = CURDATE() " +
                         "GROUP BY " +
                            "product_name"; // Change from product_id

// Print the daily sales query (for information purposes)
System.out.println("Daily Sales Query: " + dailySalesQuery);

            
       

           //DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
           // DbOperations.setDataOrDelete(productTable, "New Product Table Created Successfully");

            //String resetAutoIncrement = "ALTER TABLE product AUTO_INCREMENT = 1";
            //DbOperations.setDataOrDelete(resetAutoIncrement, "Auto-increment Reset for Product Table");
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}}
