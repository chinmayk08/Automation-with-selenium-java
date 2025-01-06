package corejava.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderString {

    @Test(dataProvider = "browser type")
    public void testmethod(String param1,String param2){
        System.out.println(param1+" "+param2);
    }

    @DataProvider(name = "browser type")
    public Object[][] data(){
        System.out.println("in data provider");
        return new Object[][]
                {
                        {"abc","xyz"},
                        {"pwe","dff"}
                };
    }
}
