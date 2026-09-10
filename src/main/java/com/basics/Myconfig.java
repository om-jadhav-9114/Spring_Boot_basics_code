package com.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {

    @Bean
    public  Myservice createobject(){

        Myservice serv=new Myservice();
        System.out.println("this is config class");
        return serv;

    }
}
