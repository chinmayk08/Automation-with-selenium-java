package Project.tests;

import Project.businessLib.ArithmaticOperations;
import Project.framework.ExecutionDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AdditionTest extends ExecutionDriver {

    @Test(priority = 1)
    public void intPositiveTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("Add",70,10,10);
        Assert.assertEquals(actualresult,10);
    }
    @Test(priority = 2)
    public void intNagativeTest() {
        ArithmaticOperations add=new ArithmaticOperations(driver);
        int actualresult= add.performOperation("Add",-70,-10);
        Assert.assertEquals(actualresult,-80);
    }
    @Test(priority = 3)
    public void ispositiveagativeTest() {
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        ArithmaticOperations add = new ArithmaticOperations(driver);
        int actualresult = add.performOperation("Add", 50, 80, -70, -10);
        Assert.assertEquals(actualresult, 50);
    }
}
