/*
 * Author Name: Divyansh Bhardwaj
 * Date: 21-02-2023
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.bej.domain;

public class User {
    private String username;
    private String password;
    private ProductOrder order;

    public User(String username, String password, ProductOrder order) {
        this.username = username;
        this.password = password;
        this.order = order;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ProductOrder getOrder() {
        return order;
    }

    public void setOrder(ProductOrder order) {
        this.order = order;
    }
}
