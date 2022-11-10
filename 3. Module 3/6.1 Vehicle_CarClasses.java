package com.doxalearn.LearnJava;

public class Vehicle {
    private String color;
    private int numDoors;
    private boolean turbo;
    private int topSpeed;
    private String fuelType;

    public Vehicle(int numDoors, int speed, boolean turbo, String fuel){
        this.numDoors = numDoors;
        this.topSpeed = speed;
        this.turbo = turbo;
        this.fuelType = fuel;
    }

    public void Accelerate(){
        System.out.println("The vehicle is speeding up...");
    }

    public void Decelerate(){
        System.out.println("The vehicle is slowing down...");
    }

    public void SetColor(String color){
        this.color = color;
    }

    public void GetDetails(){
        System.out.println("Color: " + this.color);
        System.out.println("No. of doors: " + this.numDoors);
        System.out.println("Top Speed: " + this.topSpeed + " km/h");
        System.out.println(turbo ? "Has a turbo" : "No turbo included"); //ternary operator
    }
}

public class Car extends Vehicle{
    private String doorType;

    public Car(int numDoor, int speed, boolean turbo, String fuel){
        super(numDoor, speed, turbo, fuel); //super keyword
    }

    public void SetDoorType(String doorType){
        this.doorType = doorType;
    }

    public void GetDetails(){ //polymorphism
        super.GetDetails();
        System.out.println("Door type: " + doorType);
    }

}

public class SportsCar extends Car{

    public SportsCar(int numDoors, int speed, boolean turbo, String fuel){
        super(numDoors, speed, turbo, fuel);
    }

    public void Accelerate(){
        System.out.println("Zero to 100 in 6 seconds...");
    }
}
