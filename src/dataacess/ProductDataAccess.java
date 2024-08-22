/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataacess;
import model.Product;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author madhurshinde
 */
public class ProductDataAccess {
    
    
    public static void save(Product product){
    
    
    String query="insert into product(name,price) values('"+product.getName()+"','"+product.getPrice()+"')";
    DbOperations.setDataOrDelete(query," PRODUCT ADDED SUCCESSFULLY");
    }
    
    public static ArrayList<Product> getAllRecords(){
    ArrayList<Product> arrayList=new ArrayList<>();
    try{
    ResultSet rs=DbOperations.getData("select *from product");
    while(rs.next()){
    Product product=new Product();
    product.setId(rs.getInt("id"));
    product.setName(rs.getString("name"));
    product.setPrice(rs.getString("price"));
    arrayList.add(product);
    }
    
    }
    catch (Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    
    }
    return arrayList;
    }
    
    public static void update(Product product){
    
   
    String query = "update product set name='" + product.getName() + "', price='" + product.getPrice() + "' where id='" + product.getId() + "'";

    DbOperations.setDataOrDelete(query,"Product updated Successfully");
    }
    
    public static void delete(String id){
    
        
        String query="delete from product where id= '"+id+"'";
        DbOperations.setDataOrDelete(query,"Product deleted Successfully");
    }

    public static Product getAllRecords(String ProductName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
