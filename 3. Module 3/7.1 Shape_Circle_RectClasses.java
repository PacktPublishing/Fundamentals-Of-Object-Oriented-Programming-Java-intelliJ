package com.doxalearn.LearnJava;

public abstract class Shape {
    private String color;

    public Shape(){
        this.color = "Unknown";
    }

    public Shape(String color){
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    //Abstract methods
    public abstract void draw();
    public abstract double getArea();
    public abstract double getPerimeter();
}

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        super("Blue");
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * radius;
    }
}

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        super("Orange");
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }
}
