package h11_exceptions.exercise_4;

import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader {

    private java.io.FileReader fileReader;


    public int read() {
        try {
            return fileReader.read();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return -1;
    }


    public void close() {
        try {
            fileReader.close();
            System.out.print("File closed: ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public FileReader getFileReader() {
        return fileReader;
    }

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }
}