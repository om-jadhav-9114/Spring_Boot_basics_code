package com.basics.controller;

import com.basics.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class chefrestrocontroller {

    @Autowired
    Restaurant r;

    @GetMapping("/foodinfo")
    public String foodinfo(){

        return r.serveFood();
    }
}
