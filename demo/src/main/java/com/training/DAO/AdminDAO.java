package com.training.DAO;

import java.util.*;
import java.sql.*;
import com.training.Model.Product;
import com.training.util.ConnectionUtil;




public class AdminDAO {
    private List<Product> prodlist;
    private Scanner scan;

    public AdminDAO(){
        scan = new Scanner (System.in);
        prodlist = new ArrayList<>();
    }

    //Retrieve all products from the product table
    public List<Product> getAllProducts(){
     Connection connection = ConnectionUtil.getConnection();
    try {
        String sql = "SELECT * FROM product";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            Product product = new Product(rs.getInt("product_id"),
            rs.getString("product_name"),
            rs.getFloat("selling_price"),
            rs.getInt("available_quantity"));
            prodlist.add(product);
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return prodlist;
    }

   //Retrieve all product from the product table, identified by the product id 
    public Product getProductByid(int id){
        Connection connection = ConnectionUtil.getConnection();
        try {
            String sql = "SELECT * FROM product WHERE product_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
             while (rs.next()){
             Product product = new Product(rs.getInt("product_id"),
             rs.getString("product_name"),
             rs.getFloat("selling_price"),
             rs.getInt("available_quantity"));
             return product;
           }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    //Retrieve all product from the product table identified by the category
    public Product getProductByCategory(String category){
        Connection connection = ConnectionUtil.getConnection();
        try {
            String sql = "SELECT p.product_name FROM product p JOIN item i ON p.product_id = i.item_id WHERE i.category = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, category);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Product product = new Product(rs.getInt("product_id"),
             rs.getString("product_name"),
             rs.getFloat("selling_price"),
             rs.getInt("available_quantity"));
             return product;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;

    }

    //Retrieve all product from the product table identified by the product name
     public Product getProductByName(String name){
        Connection connection = ConnectionUtil.getConnection();
        try {
            String sql = "SELECT * FROM product WHERE product_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            ResultSet rs = preparedStatement.executeQuery();
             while (rs.next()){
             Product product = new Product(rs.getInt("product_id"),
             rs.getString("product_name"),
             rs.getFloat("selling_price"),
             rs.getInt("available_quantity"));
            return product;
           }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public Product inserProduct(Product product){
        Connection connection = ConnectionUtil.getConnection();
        try {
            String sql = "INSERT INTO product (product_name,selling_price,available_quantity) VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = null;
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setFloat(2, product.getSellingPrice());
            preparedStatement.setInt(3,product.getAvailableQuantity());

            preparedStatement.executeUpdate();
            rs = preparedStatement.getGeneratedKeys();
        if(rs.next()){
            product.setProductId(rs.getInt(1));
            return product;
         }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public void totalAmountSpent(){


    }

    public void displayProfitByCategory(){

    }
}
