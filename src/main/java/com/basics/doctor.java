package com.basics;

import org.springframework.stereotype.Component;

@Component
public class doctor {

    String name="Dr. shubham";
    String type="surgon";

    public String getdoctorinfo(){

        return "Name of doctor : "+name+"  type is: "+type;
    }

}
