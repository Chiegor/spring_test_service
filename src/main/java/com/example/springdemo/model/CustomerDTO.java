package com.example.springdemo.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data // переопределяет equals и hashcode
@AllArgsConstructor // create constructor
public class CustomerDTO {
    private int id;
    private String name;
}
