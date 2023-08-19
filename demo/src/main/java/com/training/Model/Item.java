package com.training.Model;
import java.util.*;
import java.util.Objects;

public class Item extends Product {
    private int itemId;
    private String itemName;
    private String category;
    private double buyingPrice;
    private List<String> itemList;


    public Item() {
    }

    public Item(int itemId,String itemName, String category, double buyingPrice, List<String> itemList) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.buyingPrice = buyingPrice;
        this.itemList = itemList;
    }
    public int getItemId(){
        return this.itemId;
    }
    
    public void setItemId(int itemId){
       this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public List<String> getItemList() {
        return this.itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    public Item itemName(String itemName) {
        setItemName(itemName);
        return this;
    }

    public Item category(String category) {
        setCategory(category);
        return this;
    }

    public Item buyingPrice(double buyingPrice) {
        setBuyingPrice(buyingPrice);
        return this;
    }

    public Item itemList(List<String> itemList) {
        setItemList(itemList);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Item)) {
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(itemName, item.itemName) && Objects.equals(category, item.category) && buyingPrice == item.buyingPrice && Objects.equals(itemList, item.itemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, category, buyingPrice, itemList);
    }

    @Override
    public String toString() {
        return "{" + " itemId='" + getItemId() +
            " itemName='" + getItemName() + "'" +
            ", category='" + getCategory() + "'" +
            ", buyingPrice='" + getBuyingPrice() + "'" +
            ", itemList='" + getItemList() + "'" +
            "}";
    }
    
    
}
