package com.basics;

import org.springframework.stereotype.Component;

@Component
public class Chef {

    String chef_name="Tushar patil";
    String s_dish="Paneer tikka";

    public String cookFood(){

        return "Chef name : "+chef_name+"\nSpecial dish is: "+s_dish;
    }
}
