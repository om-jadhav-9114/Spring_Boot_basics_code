package com.basics;

import org.springframework.stereotype.Component;

@Component
public class Book {

    String title="wings of fire";
    String author="A.p.j abdul kalam";

    public String getbookinfo(){

        return "Book name is: "+title+"\nWritten by : "+author;
    }
}
