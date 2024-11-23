package corejava.ExceptionHandling;

import java.io.FileNotFoundException;

public class user2 {

    public static void main(String[] args) {
        CompiletimeException obj1=new CompiletimeException();

        try{
            obj1.test();
            System.out.println("in try");
        }
        catch(FileNotFoundException e){
            System.out.println("in catch");
        }
        finally{
            System.out.println("in finally");
        }
    }



}
