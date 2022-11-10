package com.doxalearn.LearnJava;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/** https://www.golinuxcloud.com/java-create-write-to-file-examples/
File & Exception Handling
*
*      try{
*     //statements
*     }
*     catch(exceptionType){
*         // statements
*     }
*/

public class Main {

    public static void main(String[] args) throws IOException {

        //write to file using BufferedWriter
        String content = "Writing to the file using BufferedWriter.";
        String addContent = "\nAppending some additional content.";
        //create buffered object
        BufferedWriter writer = new BufferedWriter(new FileWriter("MyFile.txt", true));
        //add data to file
        writer.write(addContent);
        //close writer when finished
        writer.close();

        //try block
//        try{
//            //create file
//            File myFile = new File("C://MyFile.txt");
//
//            //check if file was created
//            boolean isCreated = myFile.createNewFile();
//            if(isCreated){
//                System.out.println("File created successfully");
//            }else{
//                System.out.println("File already exists!");
//            }
//            //catch any IO exceptions
//        }catch (IOException e){
//            System.out.println("Exception occurred trying to create file: ");
//            e.printStackTrace();
//        }

        //using fileOutputStream

//        try(FileOutputStream fileOutputStream = new FileOutputStream("MyFile2.csv")){
//            System.out.println("File successfully created.");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Path myFile = Paths.get("MyFile3.py");
//        try{
//            Path checkExists = Files.createFile(myFile);
//            System.out.println("File created: " + checkExists);
//        }
//        //catch block
//        catch (IOException e){
//            System.out.println("Exception occurred: ");
//            e.printStackTrace();
//        }

    }
}