package com.basics.controller;


import com.basics.Myservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myconfigcontroller {

    @Autowired
    Myservice s;

    @GetMapping("/getserviceinfo")
    public String getconfiginfo(){

        return s.service();
    }


}
