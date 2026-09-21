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

    // Patch @PatchMapping
    @PatchMapping("/updatestudent")
    public String updatestudent(@RequestParam int rollno,
                                @RequestBody Student newstud){
        Student existingstudent = new Student();


        //step 2
        for(Student s:students){

            if(s.getRollno()==rollno){

                existingstudent=s;
            }
        }

        // step 3
        if(existingstudent.getRollno()==0){

            return "no matching found for given roll no";
        }

        // Step 4
        if(newstud.getName()==null&&
           newstud.getCourse()==null
           && newstud.getMarks()==0.0){
            return "not new data provide";
        }

        // step 5
        if(newstud.getName() != null){
            existingstudent.setName(newstud.getName());
        }

        if(newstud.getCourse() != null){

            existingstudent.setCourse(newstud.getCourse());
        }
        if(newstud.getMarks() != 0.0){
            existingstudent.setMarks(newstud.getMarks());
        }

        return "student data is updated";
    }

    @PutMapping("/updatestude")
    public String updatestude(@RequestParam int rollno,
                              @RequestBody Student newstude){

        // step 1
        Student existingstudent= new Student();

        //step 2
        for(Student s: students){

            if(s.getRollno()== rollno){
                existingstudent=s;
            }
        }

        //step 3
        if(existingstudent.getRollno()==0){

            return "no matching records found in for given roll no";
        }

        if(newstude.getName()==null
        || newstude.getCourse()==null
        || newstude.getMarks()==0.0){
            return "need to provide entire objects";
        }

        existingstudent.setName(newstude.getName());
        existingstudent.setCourse(newstude.getCourse());
        existingstudent.setMarks(newstude.getMarks());


        return "student data is updated";
    }

}
