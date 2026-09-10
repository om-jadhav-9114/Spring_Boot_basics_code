package com.basics.controller;

import com.basics.library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class booklibrarycontroller {

    library l;

    @Autowired
    public void setl(library l1){

        l=l1;
    }

    @GetMapping("/getlibraryinfo")
    public String getlibraryinfo(){

        return l.getlibraryinfo();
    }
}
