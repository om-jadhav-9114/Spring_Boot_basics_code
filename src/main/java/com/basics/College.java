package com.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {

    String c_name="zeel institude";
    String location="narhe, pune";

    @Autowired
    Student s;

    public String collegeinfo(){

        return s.studinfo()+
                "\nCollege name is: "+c_name+
                "\nLocation is : "+location;
    }
}
