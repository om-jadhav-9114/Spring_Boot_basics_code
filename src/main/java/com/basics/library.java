package com.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class library {

    Book b;

    @Autowired
    public void setb(Book b1){

        b=b1;
    }

    String l_name="nethaji Abhyasica";
    String location="tasgaon , Sangli";

    public String getlibraryinfo(){

        return b.getbookinfo()+"\nLibrary name is : "+l_name+"\nlocated in: "+location;
    }
}
