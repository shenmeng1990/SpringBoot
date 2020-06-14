package com.alibaba.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author shenmeng
 * @Date 2020/6/12
 **/
@Data
public class Student implements Serializable{

    private static final long serialVersionUID = -322578097227500103L;

    private Integer id;

    private String name;

    private Integer age;
}
