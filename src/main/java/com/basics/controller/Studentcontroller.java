package com.basics.controller;


import com.basics.Entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Studentcontroller {
    // task:accept student record (objct) from user
    //and add it in list
    List<Student> students = new ArrayList<>();

    @PostMapping("/addstudent")
    public String addstudent(@RequestBody Student s) {
        //student s{ rollno=1 name="parag" course="java" marks=80.90y:

        students.add(s);
        return "student record added successfully";
    }

    @GetMapping("/getstudent")
    public List<Student> getstudent() {

        return students;
    }

    //method to aceept  list from user and add it in orignal llist
    @PostMapping("/addstudlist")
    public String addstudentlist(@RequestBody List<Student> studlist) {
        students.addAll(studlist);
        return "Student updated";

    }

    @GetMapping("/findbyrollno")
     public Student findbyrollno(@RequestParam int rollno){

        for(Student s:students){
            if(s.getRollno()==rollno){
                return s;
            }
        }
        return null;
    }

    @GetMapping("/findbyname")
    public List<Student>findbyname(@RequestParam String name){

        List<Student>namelist=new ArrayList<>();

        for(Student s:students){

            if(s.getName().equalsIgnoreCase(name)){

                namelist.add(s);
            }
        }
        return namelist;
    }

    @GetMapping("/findbymarks")
    public List<Student>findbymarks(@RequestParam double marks) {

        List<Student> marklist = new ArrayList<>();

        for (Student s : students) {
            if (s.getMarks() > marks) {

                marklist.add(s);
            }

        }
        return marklist;

    }

        // find all students whose course get match with given course
    @DeleteMapping("/deletebyrollno")
    public String deletebyrollno(@RequestParam int rollno){

        for(Student s:students){

            if(s.getRollno()==rollno){

                students.remove(s);
                return "student record is deleted";
            }
        }

        return "no matching record found for given roll no";
    }

}
