package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

    public static void main(String[] args) {
        File f = new File("C://");
        try {
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException ex){

        }

    }
}
