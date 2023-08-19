package com.training.Model;
import java.util.*;
import java.util.Objects;

public class User {
    private String username;
    private String password;
    private int emailId;
    private int superCoins;
    private List <String> userList;

    public User() {
    }

    public User(int emailId,String username, String password, int superCoins, List<String> userList) {
        this.emailId = emailId;
        this.username = username;
        this.password = password;
        this.superCoins = superCoins;
        this.userList = userList;
    }

    public User(String username, String password, int superCoins, List<String> userList){
        this.username = username;
        this.password = password;
        this.superCoins = superCoins;
        this.userList = userList;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmailId() {
        return this.emailId;
    }

    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }

    public int getSuperCoins() {
        return this.superCoins;
    }

    public void setSuperCoins(int superCoins) {
        this.superCoins = superCoins;
    }

    public List<String> getUserList() {
        return this.userList;
    }

    public void setUserList(List<String> userList) {
        this.userList = userList;
    }

    public User username(String username) {
        setUsername(username);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User emailId(int emailId) {
        setEmailId(emailId);
        return this;
    }

    public User superCoins(int superCoins) {
        setSuperCoins(superCoins);
        return this;
    }

    public User userList(List<String> userList) {
        setUserList(userList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password) && emailId == user.emailId && superCoins == user.superCoins && Objects.equals(userList, user.userList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, emailId, superCoins, userList);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", emailId='" + getEmailId() + "'" +
            ", superCoins='" + getSuperCoins() + "'" +
            ", userList='" + getUserList() + "'" +
            "}";
    }

    
}
