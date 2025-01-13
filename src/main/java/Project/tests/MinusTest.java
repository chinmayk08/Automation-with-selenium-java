package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinusTest extends ExecutionDriver {

    @Test(priority = 1)
    public void intPositiveTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("minus",70,10,10);
        Assert.assertEquals(actualresult,50);
    }
    @Test(priority = 2)
    public void intNagativeTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("minus",-70,-10);
        Assert.assertEquals(actualresult,-60);
    }
    @Test(priority = 3)
    public void ispositiveagativeTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("minus",50,80,-70,-10);
        Assert.assertEquals(actualresult,50);
    }
}
