package com.doxalearn.LearnJava;

/** Constants & Enums 
 *
 */

public class Main {

    // declare const with final keyword
    static final double PI = 3.14159;

    // declare enum
    enum Color{
        RED,
        YELLOW,
        BLUE;

        //enum constructor, will be called for each individual constant
        private Color(){
            System.out.println("Constructor called for: " + this.toString());
        }

        //method
        public  void colorInfo(){
            System.out.println("These are the primary colors.");
        }
    }

    public static void main(String[] args) {

        Color col1 = Color.BLUE;
        System.out.println(col1);
        col1.colorInfo();

//        final int THRESHOLD = 5;
//        Color color = Color.BLUE;
//        Color colorArray[] = Color.values();
//
//        // loop through enum
//        for(Color col : colorArray){
//            System.out.println(col + " at index " + col.ordinal());
//        }
//
//        System.out.println(THRESHOLD);
//        System.out.println(Color.RED);
//        System.out.println(color);
    }
}