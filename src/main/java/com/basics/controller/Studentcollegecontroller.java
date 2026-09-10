package com.basics.controller;

import com.basics.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentcollegecontroller {

    @Autowired
    College c;

    @GetMapping("/getcollegeinfo")
    public String getcollegeinfo(){

        return c.collegeinfo();
    }
}
