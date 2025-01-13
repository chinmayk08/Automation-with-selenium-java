package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivideTest extends ExecutionDriver {

    @Test(priority = 1)
    public void intPositiveDivideTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("divide",80,10);
        Assert.assertEquals(actualresult,8);
    }
    @Test(priority = 2)
    public void intNagativeDivideTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("divide",-80,-10);
        Assert.assertEquals(actualresult,8);
    }
    @Test(priority = 3)
    public void ispositiveagativeDivideTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("divide",50,-10);
        Assert.assertEquals(actualresult,-5);
    }
}
