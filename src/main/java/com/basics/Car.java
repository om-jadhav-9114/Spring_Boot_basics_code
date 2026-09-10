package com.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Car {

    @Autowired
    Engin e;

    public String driving(){

        return e.start()+"\nI am drive the car";
    }
}
