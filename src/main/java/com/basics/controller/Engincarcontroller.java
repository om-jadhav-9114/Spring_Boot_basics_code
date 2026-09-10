package com.basics.controller;

import com.basics.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Engincarcontroller {

    @Autowired
    Car c;

    @GetMapping("/carinfo")
    public String carinfo(){

        return c.driving();
    }
}
