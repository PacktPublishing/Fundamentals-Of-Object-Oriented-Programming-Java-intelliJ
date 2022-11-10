package com.doxalearn.LearnJava;


public interface Walkable {
    void walk();
}


public class Person implements Walkable{
    int age;
    String name;
    char sex;

    Person() { } //Default Constructor

    Person(int age, String name, char sex){ // Parametized Constructor
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    void SetDetails(String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void PrintPersonDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
    }

    @Override
    public void walk() {
        System.out.println("Person is walking...");
    }
}

public class Dog implements Walkable{
    @Override
    public void walk() {
        System.out.println("Dog is walking...");
    }
}

