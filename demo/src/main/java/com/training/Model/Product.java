package com.training.Model;
import java.util.*;

public class Product {
    private int productId;
    private String productName;
    private double sellingPrice;
    private int availableQuantity;
    private Map<Integer,String> productList;


    public Product() {
    }

    public Product(int productId, String productName, double sellingPrice, int availableQuantity, Map<Integer, String> productList) {
        this.productId = productId;
        this.productName = productName;
        this.sellingPrice = sellingPrice;
        this.availableQuantity = availableQuantity;
        this.productList = productList;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSellingPrice() {
        return this.sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Map<Integer, String> getProductList() {
        return this.productList;
    }

    public void setProductList(Map<Integer, String> productList) {
        this.productList = productList;
    }

    public Product productId(int productId) {
        setProductId(productId);
        return this;
    }

    public Product productName(String productName) {
        setProductName(productName);
        return this;
    }

    public Product sellingPrice(double sellingPrice) {
        setSellingPrice(sellingPrice);
        return this;
    }

    public Product availableQuantity(int availableQuantity) {
        setAvailableQuantity(availableQuantity);
        return this;
    }

    public Product productList(Map<Integer, String> productList) {
        setProductList(productList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return productId == product.productId && Objects.equals(productName, product.productName) && sellingPrice == product.sellingPrice && availableQuantity == product.availableQuantity && Objects.equals(productList, product.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, sellingPrice, availableQuantity, productList);
    }

    @Override
    public String toString() {
        return "{" +
            " productId='" + getProductId() + "'" +
            ", productName='" + getProductName() + "'" +
            ", sellingPrice='" + getSellingPrice() + "'" +
            ", availableQuantity='" + getAvailableQuantity() + "'" +
            ", productList='" + getProductList() + "'" +
            "}";
    }
    
}
