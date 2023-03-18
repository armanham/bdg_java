package com.bdg.h11_exceptions.exercise_4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\user\\Java Projects\\bdg_java\\src\\oca_reviewquestions\\Chapter 4.txt";
        CustomFileReader fileReader = new CustomFileReader();

        try {
            fileReader.setFileReader(new FileReader(fileName));
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}