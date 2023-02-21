/*
 * Author Name: Divyansh Bhardwaj
 * Date: 21-02-2023
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.bej.bean;

import com.niit.bej.domain.ProductOrder;
import com.niit.bej.domain.User;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public ProductOrder createProductOrder() {
        return new ProductOrder(1, 1000.0);
    }

    @Bean
    public User createUser() {
        return new User("dbc2201", "123ghj79", createProductOrder());
    }
}
