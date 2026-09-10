package com.basics.controller;

import com.basics.Laptop;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class laptopcontroller {

    Laptop l;

    public laptopcontroller(Laptop l1){

        l=l1;
    }

    @GetMapping("/getlaptopinfo1")
    public String getlaptopinfo(){

        return l.getlaptopinfo();
    }
}
