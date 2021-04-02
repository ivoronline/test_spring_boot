package com.ivoronline.test_spring_boot.controllers;

import com.ivoronline.test_spring_boot.model.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

  @Autowired
  PersonEntity personEntity;

  @RequestMapping("/person")
  public String getPerson() {
    System.out.println("Hello from getPerson()");
    personEntity.setName("John");
    System.out.println(personEntity.getName());
    return "test";
  }

}


