package com.example.springboot;


import org.springframework.data.annotation.Id;

public class Model {
    @Id
    private int id;
    private String str;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
