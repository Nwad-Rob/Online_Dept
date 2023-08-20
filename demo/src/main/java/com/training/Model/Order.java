package com.training.Model;
import java.util.Objects;

public class Order extends User{
    private int order_id;
    private String order_name;
    private int order_total;


    public Order() {
    }

    public Order(int order_id, String order_name, int order_total) {
        this.order_id = order_id;
        this.order_name = order_name;
        this.order_total = order_total;
    }

    public int getOrder_id() {
        return this.order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getOrder_name() {
        return this.order_name;
    }

    public void setOrder_name(String order_name) {
        this.order_name = order_name;
    }

    public int getOrder_total() {
        return this.order_total;
    }

    public void setOrder_total(int order_total) {
        this.order_total = order_total;
    }

    public Order order_id(int order_id) {
        setOrder_id(order_id);
        return this;
    }

    public Order order_name(String order_name) {
        setOrder_name(order_name);
        return this;
    }

    public Order order_total(int order_total) {
        setOrder_total(order_total);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return order_id == order.order_id && Objects.equals(order_name, order.order_name) && order_total == order.order_total;
    }

    @Override
    public int hashCode() {
        return Objects.hash(order_id, order_name, order_total);
    }

    @Override
    public String toString() {
        return "{" +
            " order_id='" + getOrder_id() + "'" +
            ", order_name='" + getOrder_name() + "'" +
            ", order_total='" + getOrder_total() + "'" +
            "}";
    }
    
}