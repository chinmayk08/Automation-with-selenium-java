package corejava.testng;

import org.testng.annotations.Test;

public class groupexample {

    @Test(groups = {"smoke","Regrssion"})
    public void method1(){
        System.out.println("this is smoke and regrssion test");
    }
    @Test(groups = {"Regrssion"})
    public void method2(){
        System.out.println("this is regrssion test");
    }
    @Test(groups = {"smoke"})
    public void method3(){
        System.out.println("this is smoke test");
    }
}
