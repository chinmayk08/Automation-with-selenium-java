package corejava.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment1 {

    @Test(dataProvider = "number")
    public void testmethod(int num1, int num2, int result) {
        System.out.println("in test case ");
        int addition = num1 + num2;
        int expected = result;
        Assert.assertEquals(expected, addition);
        System.out.println("Expected result is:" + expected + " and Actual result is:" + addition);
    }

    @DataProvider(name="number")
    public Object [][] data(){
            return new Object[][]
        {
            {1,2,3},
            {1,2,3}

        };
    }
}
