package com.ivoronline.test_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class TestSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(TestSpringBootApplication.class, args);
    System.out.println("Hello from main()");
  }

}
