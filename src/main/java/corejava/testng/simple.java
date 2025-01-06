package corejava.testng;

import org.testng.annotations.Test;

public class simple {

    @Test(priority = 1)
    public void ABC(){
        System.out.println("test ABC");
    }
    @Test(priority = 2,enabled=false)
    public void xyz(){
        System.out.println("xyz");
    }
}
