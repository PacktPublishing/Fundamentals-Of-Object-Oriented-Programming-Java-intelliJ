package com.doxalearn.LearnJava;

public class Date {

    private int day;
    private int month;
    private int year;
    String holiday;

    public Date(){ //default constructor
        // define values for each data member
        day = 0;
        month = 0;
        year = 0;
    }

    public Date(int day, int month, int year){ // Parameterized constructor
        //Arguments passed are used as values
        this.day = day; // this keyword used when argument has same name as a data member
        this.month = month;
        this.year = year;
    }

    public Date(int day, int month, int year, String holiday){ // overloaded parameterized constructor
        this(day, month, year); // calling the constructor
        this.holiday = holiday;
    }


    //function to print date
    public void PrintDate(){
        System.out.println("Date: " + day + "/" + month + "/" + year + " -->" + holiday);
    }
	
	    public static void main(String[] args) {

        Date date = new Date(05, 05, 2021, "Cinco de Mayo");
        Date holiday = new Date(25, 12, 2022, "Christmas");

        date.PrintDate();
        holiday.PrintDate();
    }
}