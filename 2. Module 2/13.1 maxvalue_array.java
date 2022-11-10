package com.doxalearn.LearnJava;

/** Methods https://www.educative.io/courses/learn-java-from-scratch/B8NwZMr0GYX
 *
 * Create a function that accepts an Array of numbers
 * passed as a parameter and returns the highest number
 * in the array.
 */

public class Main {

    public static int findMaxValue(int[] array){

        int max = array[0]; // store value at index zero

        // iterate through array elements
        for(int i = 1; i < array.length; i++){

            // check if current element has a greater value then stored value in max
            if(array[i] > max){

                max = array[i]; //if true store new value in max
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] values = {54, 28, 147, 97, 4};

        System.out.println("The maximum value in the array is: " + findMaxValue(values));
    }
}