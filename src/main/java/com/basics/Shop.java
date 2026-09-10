package com.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shop {

    String s_name="vijay sales";
    String location ="pune";

    @Autowired
    Product p;

    public String openShop(){

        return p.getProductDetails()+"\nShop name is: "+s_name+"\nlocation is: "+location;

    }
}
