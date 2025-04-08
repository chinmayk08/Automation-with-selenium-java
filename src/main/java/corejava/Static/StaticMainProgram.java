package corejava.Static;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class StaticMainProgram {

    public  void method() throws ArithmeticException{
        try {

        }
        catch (Exception e){
            throw e;
        }
        Static.abc=10;
        Static.add();
        throw new ArithmeticException();
    }

    public static void main(String[] args) throws FileNotFoundException {
        StaticMainProgram obj=new StaticMainProgram();
        obj.method();

        FileReader a= new FileReader("cs");


    }
}
