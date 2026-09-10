package com.basics.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class secondcontroller {

    @GetMapping("/hii")
    public String show(){
        return "hii i am om jadhav";
    }

    @GetMapping("/calpower")
    public String calpow(@RequestParam int a,
                         @RequestParam int b){

        return "power is : "+Math.pow(a,b);
    }


}
