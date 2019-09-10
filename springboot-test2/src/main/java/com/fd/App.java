package com.fd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.fd.web"})
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
