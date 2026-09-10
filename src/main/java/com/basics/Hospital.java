package com.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

    doctor d;


    Hospital(doctor d1){

        d=d1;
    }

    String h_name="Bharti hospital";
    String location="pune";
    public String gethospitalinfo(){

        return d.getdoctorinfo()+"  work At the "+h_name+" is located in : "+location;
    }
}
