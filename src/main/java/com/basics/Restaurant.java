package com.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    String Restro_name="Jay shankar dining holl";
    String location="dhankawadi , pune";

    @Autowired
    Chef c;

    public String  serveFood(){

        return c.cookFood()+"\nRestaurant name is: "+Restro_name+"\nlocation : "+location;
    }
}
