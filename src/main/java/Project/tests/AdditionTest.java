package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest extends ExecutionDriver {

    @Test(priority = 1)
    public void intPositiveTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("Add",70,10,10);
        Assert.assertEquals(actualresult,90);
    }
    @Test(priority = 2)
    public void intNagativeTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("Add",-70,-10);
        Assert.assertEquals(actualresult,-80);
    }
    @Test(priority = 3)
    public void ispositiveagativeTest() {
        ArithmaticOperations add = new ArithmaticOperations(driver);
        int actualresult = add.performOperation("Add", 50, 80, -70, -10);
        Assert.assertEquals(actualresult, 50);
    }
}
