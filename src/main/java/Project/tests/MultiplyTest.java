package Project.tests;
import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTest extends ExecutionDriver {

    @Test(priority = 1)
    public void intPositivemultiplyTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("multiply",70,10,10);
        Assert.assertEquals(actualresult,7000);
    }
    @Test(priority = 2)
    public void intNagativemultiplyTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("multiply",-70,-10);
        Assert.assertEquals(actualresult,700);
    }
    @Test(priority = 3)
    public void ispositiveagativemultiplyTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("multiply",50,80,-70,-10);
        Assert.assertEquals(actualresult,2800000);
    }
}
