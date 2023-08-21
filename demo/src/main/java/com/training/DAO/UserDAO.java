package com.training.DAO;

import java.util.*;
import java.sql.*;
import com.training.Model.User;
import com.training.util.ConnectionUtil;

public class UserDAO {

    public List<User> getAllUsers(){
        Connection connection = ConnectionUtil.getConnection();
        List<User> Users = new ArrayList<>();
        try {
            //Write SQL logic here
            String sql = "SELECT * FROM useraccount";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                User user = new User(rs.getInt("email_id"),
                        rs.getString("username"),
                        rs.getString("user_password"),
                        rs.getInt("supercoins"));
                Users.add(user);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return Users;
    }

//TODO: retrieve am account from the useraccount table, identified by its email_id.
    
    public User getAccountById(int id){
        Connection connection = ConnectionUtil.getConnection();
        try {
            //Write SQL logic here
            String sql = "SELECT * FROM useraccount where email_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            //write preparedStatement's setInt method here.
             preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               User user = new User(rs.getInt("email_id"),
                        rs.getString("username"),
                        rs.getString("user_password"),
                        rs.getInt("supercoins"));
                return user;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

//TODO: insert an account into the Account table.

public Account insertAccount(Account account){
    Connection connection = ConnectionUtil.getConnection();
    try {

        String sql = "INSERT INTO account (username, password) VALUES ( ?, ?) " ;
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = null;
        //write preparedStatement's setString method here.
        
        preparedStatement.setString(1, account.getUsername());
        preparedStatement.setString(2,account.getPassword());
        
        preparedStatement.executeUpdate();
        rs = preparedStatement.getGeneratedKeys();
        if(rs.next()){
            account.setAccount_id(rs.getInt(1));
            return account;
        }
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    return null;
}

   

    //TODO: retrieve a account from the account table, identified by its account_username.
    
    public Account getAccountByUsername(String username){
        Connection connection = ConnectionUtil.getConnection();
        try {
            //Write SQL logic here
            String sql = "SELECT * FROM account WHERE username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            //write preparedStatement's setInt method here.
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Account account = new Account(
                        rs.getInt("account_id"),
                        rs.getString("username"),
                        rs.getString("password"));
                return account;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
 
   //TODO: retrieve a account from the account table, identified by its password.
    
   public Account getAccountByPassword(String password){
    Connection connection = ConnectionUtil.getConnection();
    try {
        //Write SQL logic here
        String sql = "SELECT * FROM Account where password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //write preparedStatement's setInt method here.
         preparedStatement.setString(1, password);
        ResultSet rs = preparedStatement.executeQuery();
        while(rs.next()){
            Account account = new Account(
                    rs.getString("username"),
                    rs.getString("password"));
            return account;
        }
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
    return null;
}

//TODO: retrieve username from the account table.

    public List<Account> getUser(){
        Connection connection = ConnectionUtil.getConnection();
        List<Account> Accounts = new ArrayList<>();
        try {
            //Write SQL logic here
            String sql = "SELECT username FROM Account";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                Account Account = new Account(
                        rs.getString("username"),
                        rs.getString("password"));
                Accounts.add(Account);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return Accounts;
    }
    public void login(){
        
        
    }
    public void register(){

    }
    public void welcomeBonus(){

    }
    public void filterByPrice(){

    }
    public void filterByCategory(){
        
    }
}
