package corejava.testng;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite
    public void m1(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    public void m2(){
        System.out.println("BeforeTest");
    }
    @BeforeClass
    public void m3(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void m4(){
        System.out.println("BeforeMethod");
    }
    @Test
    public void m5(){
        System.out.println("Test");
    }
    @AfterMethod
    public void m6(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void m7(){
        System.out.println("AfterClass");
    }
    @AfterTest
    public void m8(){
        System.out.println("AfterTest");
    }
    @AfterSuite

    public void m9(){
        System.out.println("AfterSuite");

    }
}
