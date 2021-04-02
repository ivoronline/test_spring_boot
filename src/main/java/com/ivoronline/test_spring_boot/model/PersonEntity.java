package com.ivoronline.test_spring_boot.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Component
public class PersonEntity {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long    id;    //Primary Key

  private String  name;
  private Integer age;

  public PersonEntity(Long id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  //CONSTRUCTORS
  public PersonEntity() { }

  //SETTERS
  public void setId  (Long    id)   { this.id   = id;   }
  public void setName(String  name) { this.name = name; }
  public void setAge (Integer age)  { this.age  = age;  }

  //GETTERS
  public Long    getId  () { return id;   }
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

}



