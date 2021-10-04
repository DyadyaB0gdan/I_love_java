package com.example.springboot;

import com.example.springboot.Repo;
import com.sun.org.apache.xpath.internal.operations.String;

public class Model {
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

    public void setStr(int id, String str) {
        this.str = str;
    }
}
