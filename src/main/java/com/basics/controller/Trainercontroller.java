package com.basics.controller;

import com.basics.Entity.Trainer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Trainercontroller {

    List<Trainer> trainers=new ArrayList<>();

    @PostMapping("/addtrainerlist")
    public String addtainerlist(@RequestBody List<Trainer> tlist){

        trainers.addAll(tlist);
        return "trainer list added";
    }

    @GetMapping("/gettrainer")
    public List<Trainer> findalltrainer(){

        return trainers;
    }

}
