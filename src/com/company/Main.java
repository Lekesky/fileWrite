package com.company;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Leke");
        listOfStrings.add("2/24/22");
        listOfStrings.add("CSCI 1660 - Java Fun");
        String file = "JavaFun.txt";
        try {
            writeAssignment(listOfStrings, file);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void writeAssignment(ArrayList<String> assignment, String filename) throws Exception{
        try (FileWriter writer = new FileWriter(filename)){
            for(String str:assignment){
                writer.write(str + "\n");
            }
        }
        catch (FileNotFoundException e){
            throw e;
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}
