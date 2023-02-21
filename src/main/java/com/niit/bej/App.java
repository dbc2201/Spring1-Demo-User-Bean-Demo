package com.niit.bej;

import com.niit.bej.bean.BeanConfig;
import com.niit.bej.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        User user = applicationContext.getBean(User.class);
        System.out.println(user.getUsername());
    }
}
