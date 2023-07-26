package com.workintech.model;

public class Person {
    //instance variable(field)
    String firstName;
    String lastname;
    int age;
    double salary;
    boolean isMarried;

    //Constructor
    public Person(String firstName, String lastname, int age){
        this.firstName = firstName;
        this.lastname = lastname;
        this.age=age;
    }
    // Constructor overloading
    public Person(String firstName, String lastname, int age, double salary,boolean isMarried){
        this(firstName, lastname, age);
        this.salary=salary;
        this.isMarried=isMarried;

    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }
    public  boolean isTeen(){
        return age >=13 && age <=19;
    }


    public String getLastName() {
        return lastname;
    }
}
