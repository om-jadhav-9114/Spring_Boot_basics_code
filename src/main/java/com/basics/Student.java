package com.basics;

import org.springframework.stereotype.Component;

@Component
public class Student {

    String name="Om jadhav";
    String course="javafull stack";

    public String studinfo(){
        return "Name of student : "+name+
                "\nCourse is : "+course;
    }
}
