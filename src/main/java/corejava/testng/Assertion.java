package corejava.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

    @Test
    public void test123(){

        int expected=10;
        int actual=20;
        System.out.println("test123 executed3");
        Assert.assertEquals(actual,expected);
    }
}
