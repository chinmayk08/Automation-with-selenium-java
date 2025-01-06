package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionTest extends ExecutionDriver {

    @Test(priority = 1)
    public void additionTest1() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performAddition(6,4);
        Assert.assertEquals(actualresult,10);
    }
}
