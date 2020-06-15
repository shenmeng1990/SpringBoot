package com.alibaba.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author shenmeng
 * @Date 2020/6/15
 **/
@Data
@NoArgsConstructor
public class Student {

    private String name;

    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
