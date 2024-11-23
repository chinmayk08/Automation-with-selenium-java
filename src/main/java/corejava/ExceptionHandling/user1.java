package corejava.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class user1 {

    public static void main(String[] args) {
        CompiletimeException obj=new CompiletimeException();
            try {
            obj.test();
            System.out.println("in try block1");
        } catch (FileNotFoundException e) {
            System.out.println("in catch block1");
        }

        /*public static void main (String[]args){
            user1 obj = new user1();
            obj.test();
        }*/
    }
}
