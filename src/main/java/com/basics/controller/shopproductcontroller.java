package com.basics.controller;

import com.basics.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class shopproductcontroller {

    @Autowired
    Shop s;

    @GetMapping("/productinfo")
    public String productinfo(){
        return s.openShop();
    }
}
