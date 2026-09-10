package com.basics.controller;

import com.basics.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dochospitalcontroller {

     Hospital h;


    dochospitalcontroller(Hospital h1){
         h=h1;
     }

     @GetMapping("/hospitalinfo")
     public String hospitalinfo(){

         return h.gethospitalinfo();
     }

}
