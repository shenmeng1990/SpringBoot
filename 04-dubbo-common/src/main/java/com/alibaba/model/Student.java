package com.alibaba.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Data
@NoArgsConstructor
public class Student implements Serializable{

    private Integer id;

    private String name;

    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
