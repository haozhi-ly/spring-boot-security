package com.ly.springsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;

@SpringBootApplication(exclude = {SecurityFilterAutoConfiguration.class,SecurityAutoConfiguration.class,ManagementWebSecurityAutoConfiguration.class})
public class SpringSecurityTestApplication {

    public static void main(String[] args) {
        System.out.println(Object.class.isAssignableFrom(SpringSecurityTestApplication.class));
        SpringApplication.run(SpringSecurityTestApplication.class, args);
    }

}
