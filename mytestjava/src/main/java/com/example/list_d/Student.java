package com.example.list_d;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AWL on 2017/11/6.
 */

public class Student {

    private String id;
    private String name;
    private Set<Course> coursesSet;

    public Student (String id,String name){
        this.id = id;
        this.name = name;
        this.coursesSet = new HashSet<Course>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
