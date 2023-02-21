/*
 * Author Name: Divyansh Bhardwaj
 * Date: 21-02-2023
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.bej.domain;

public class ProductOrder implements Order {
    private int id;
    private double totalAmount;

    public ProductOrder(int id, double totalAmount) {
        this.id = id;
        this.totalAmount = totalAmount;
    }

    public ProductOrder() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
