package DAO;

import java.util.*;
import java.sql.*;
import com.training.Model.Product;


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
        PreparedStatement preparedStatement = connection.preparedStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()){
            Product product = new Product(rs.getInt("product_id"),
            rs.getString("product_name"),
            rs.getDouble("selling_price"),
            rs.getInt("available_quantity"));
            prodlist.add(product);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return prodlist;
    }

   //Retrieve a product from the product table, identified by the product id 
    public Product getProductByid(int id){
        Connection connection = Connectionutil.getConnection();
        try {
            String sql = "SELECT * FROM product WHERE product_id = ?";
            PreparedStatement preparedStatement = connection.preparedStatement(sql);
            preparedStatement.setInt(1,id);
            Result rs = preparedStatement.executeQuery();
             while (rs.next()){
            Product product = new Product(rs.getInt("product_id"),
            rs.getString("product_name"),
            rs.getDouble("selling_price"),
            rs.getInt("available_quantity"));
            return product;
           }
        } catch (SQLException e) {
            System.out.println(e.getmessage());
        }
        return null;
    }

    //Retrieve a product from the product table identified by the category
    public void categorizedProduct(List <Product> prodlist){

    }
    public int totalSpent(){
        return 0;
    }

    public void displayProfit(){

    }
}
