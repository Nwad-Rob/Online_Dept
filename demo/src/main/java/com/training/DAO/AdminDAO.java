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
            Product product = new Product(rs.get)
        }
    } catch (Exception e) {
        // TODO: handle exception
    }
    }
    public void search(List <Product> prodlist){
        
    }
    public void categorizedProduct(List <Product> prodlist){

    }
    public int totalSpent(){
        return 0;
    }

    public void displayProfit(){

    }
}
