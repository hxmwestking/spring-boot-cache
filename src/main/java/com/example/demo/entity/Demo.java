package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Demo implements Serializable {

    private Long id;
    private String name;
}
