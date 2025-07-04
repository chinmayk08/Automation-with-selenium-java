package corejava.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompiletimeException {

    public void test() throws FileNotFoundException {
        FileReader file = new FileReader("E:\\New folder\\abc.txt" +
                "");

    }


    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("");
            System.out.println("in try block");
        } catch (FileNotFoundException e) {
            System.out.println("in catch block"+e);
        } finally {
            System.out.println("in finally block");




        }
    }
}
