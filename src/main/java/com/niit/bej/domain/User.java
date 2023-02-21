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
}
