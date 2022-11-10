package com.doxalearn.LearnJava;

/** Arrays
 *
 * int[] intArray
 * double[] doublesArray
 * String[] stringArray
 */

public class Main {

    public static void main(String[] args) {

        int[] testScores = {76, 89, 97, 91}; // array index begins at 0
        double[] gasPrices = {3.87, 2.59, 3.13};
        String[] countries = {"Jamaica", "Canada", "USA", "Spain", "Brazil"};

        int[] primeNumbers = new int[5]; // allocate memory for array
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;


        // change value at position 3
        testScores[3] = 80; // cannot add additional elements to arrays

        // for loop to print array elements
        for(int i=0; i<gasPrices.length; i++){

            //System.out.println(gasPrices[i]);
        }

        // for each loop to print countries
        for(String i : countries){
            //System.out.println(i);
        }

        // for each loop to print prime numbers
        for(int prime : primeNumbers){
            System.out.println(prime);
        }


    }
}
