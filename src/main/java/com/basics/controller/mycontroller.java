package com.basics.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class mycontroller {

    @GetMapping("/hii")
    public String greet(){

        return "hii om , Good Afternoon!!";
    }

  @GetMapping("/info")
   public String myinfo(){
        return "name : om jadhav " +
                "\nCourse: Java Fullstack" +
                "\nHobbies: my hobby is bike riding and travlling";
   }

   @GetMapping("/add")
   public String addition(){
        int a=45,b=9;

        return "Addition is : "+(a+b);
   }

   // homework task
    // write a function for the subtraction 2 numbers
   @GetMapping("/sub")
    public String subtraction(){
        int a=26,b=10;

        return "Substration is : "+(a-b);
    }

    // write a function for a multiplication of two numbers
    @GetMapping("/multi")
    public String multiplication(){
        int a=15,b=6;

        return "Multiplication is : "+(a*b);
    }

    // write a function for a division of two numbers
    @GetMapping("/div")
    public String division(){
        int a=50,b=5;

        return "division is : "+(a/b);
    }

    // write a function for a square of the number
    @GetMapping("/squa")
    public String square(){

        int a=16;
        return "The square of the number is : "+(a*a);
    }

    @GetMapping("/cube")
    public String cube_finder(){

        int a=8;
        return "The cube of number : "+(a*a*a);
    }

    @GetMapping("/studinfo/{name}/{course}/{marks}")
    public String getstudinfo(@PathVariable("name") String nm,
                              @PathVariable("course")String co,
                              @PathVariable("marks")String m)
    {

        return "Student name is : "+nm+"\ncourse is : "+co+"\nmarks is : "+m;
    }

    @GetMapping("/areaofcircle/{r}")
    public String areaofcircle(@PathVariable float r)
    {
      return "The Area of the circle is: "+(3.14*r*r);
    }

    @GetMapping("/areaofsquare/{side}")
    public String areaofsquare(@PathVariable float side){

        return "Area of the square is : "+(side*side);
    }

    @GetMapping("/addthreenum/{a}/{b}/{c}")
    public String addthreenum(@PathVariable int a,
                              @PathVariable int b,
                              @PathVariable int c){

        return "Sum of three num: "+(a+b+c);
    }

    @GetMapping("/Evenodd/{a}")
    public String evenodd(@PathVariable int a){

        if(a%2 == 0){
            return "number is even";
        }
        else{
           return "number is odd";
        }
    }

    @GetMapping("/maxnum/{a}/{b}")
    public String maxnum(@PathVariable int a,
                         @PathVariable int b){

        if(a > b){
            return a+" is greater than "+b;
        }
        else{
            return b+" is greater than "+a;
        }
    }

    // 1) Write a function which accept two numbers from User and return result  of addition
    @GetMapping("/addition/{a}/{b}")
    public String Add(@PathVariable int a,
                      @PathVariable int b)
    {
        return "two numbers addition is "+(a+b);
    }

//2) Write a function which accept two no and return result of subtraction

    @GetMapping("/subtraction/{a}/{b}")
    public String Sub(@PathVariable int a,
                      @PathVariable int b)
    {
        return "two numbers substraction is "+(a-b);
    }
//3) Write a function which accept two no and return result of division

    @GetMapping("/division/{a}/{b}")
    public String Div(@PathVariable int a,
                      @PathVariable int b)
    {
        return "two numbers division is "+(a/b);
    }
//4) Write a function which accept two no and return result of multiplication

    @GetMapping("/mul/{a}/{b}")
    public String Mul(@PathVariable int a,
                      @PathVariable int b)
    {
        return "two numbers multiplication is "+(a*b);
    }

//5) Write a function which accept no from user and calculate square

    @GetMapping("/square/{a}")
    public String Squ(@PathVariable int a)
    {
        return "two numbers square is "+(a*a);
    }

//6) Write a function which accept no from user and calculate cube

    @GetMapping("/cub/{a}")
    public String Cub(@PathVariable int a)
    {
        return "two numbers square is "+(a*a*a);
    }

    @GetMapping("/developerinfo")
    public String devinfo(@RequestParam String name,
                          @RequestParam int exp,
                          @RequestParam String tech){

        return "developer name is : "+name+
                "\nexperience is : "+exp+" years"+
                "\ntechnology is : "+tech;
    }

    @GetMapping("/simpleinterest")
    public String interest(@RequestParam int amo,
                           @RequestParam int year,
                           @RequestParam int rate){

        return " The simple interest is : "+(amo*year*rate)/100;
    }

    @GetMapping("/vote")
    public String voting(@RequestParam int age){

         if(age > 18){
             return "Eligible for the vote";
         }
         else{
             return "Not eligible for vote";
         }
    }

    @GetMapping("/totalmarks")
    public String totalmarks(@RequestParam int math,
                             @RequestParam int java,
                             @RequestParam int python,
                             @RequestParam int phy,
                             @RequestParam int chem){

        return " total marks is obtained : "+(math+java+python+phy+chem)+" out of 500";
    }

    @GetMapping("/bookinfo")
    public String bookinfo(@RequestParam int bookid,
                             @RequestParam String name,
                             @RequestParam float price,
                             @RequestParam String author){

        return "Book id : "+bookid+
                "\nBook name : "+name+
                "\nprice : "+price+
                "\nBook Author: "+author;
    }



    //    1) write function which accept no from user and check it is positive or not

    @GetMapping("/possnige")
    public String isPositive(@RequestParam int num){

        if(num > 0 ){
            return "Number is Positive";
        }else if(num<0){
            return "Number is Negative";
        }else{
            return "Number is Zero";
        }

    }

//    2) write function which accept total marks from user and
//    check if marks >=40 then student is pass otherwise fail

    @GetMapping("/passfail")
    public String result(@RequestParam int marks){

        if(marks>=40){
            return "Pass";
        }else{
            return "Fail";
        }
    }

//    3) write function which accept radius and calculate area of circle

    @GetMapping("/areaofcic")
    public String AreaOfCir(@RequestParam float r){

        return "Area of circle: "+ (3.14 * r * r);

    }

//    4) write function which accept side and calculate area of square

    @GetMapping("/areasquare")
    public String AreaOfSqu(@RequestParam double side){

        return "Area of Square is "+(side * side);

    }

    @RequestMapping("/getcollegeinfo")
    public String collegeinfo(@RequestParam String name,
                              @RequestParam String location){

        return "name of college : "+name+"" +
                "\nlocation is : "+location;
    }


}
