package com.example.list_d;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AWL on 2017/11/6.
 */

public class Student {

    private String id;
    private String name;
    private Set courses;

    public Student (String id,String name){
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
}
