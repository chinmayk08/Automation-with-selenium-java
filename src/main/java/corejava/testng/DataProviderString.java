package corejava.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderString {

    @Test(dataProvider = "browser type")
    public void testmethod(String param1,String param2, String pp){
        System.out.println(param1+" "+param2+" "+pp);
    }

    @DataProvider(name = "browser type")
    public Object[][] data(){
        //System.out.println("in data provider");
        return new Object[][]
                {
                        {"abc","xyz","ooo"},
                        {"pwe","dff","iuy"}
                };
    }
}



