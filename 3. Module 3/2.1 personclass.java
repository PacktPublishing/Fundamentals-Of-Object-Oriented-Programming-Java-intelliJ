package com.doxalearn.LearnJava;

public class Person {
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
	
	    public static void main(String[] args) {

        Person p1 = new Person(32, "Lee Miles", 'M');
        Person p2 = new Person();

        p2.SetDetails("Janet Green", 41, 'F');

        p1.PrintPersonDetails();
        p2.PrintPersonDetails();
    }
}