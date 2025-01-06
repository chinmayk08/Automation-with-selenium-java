package Project.businessLib;

import Project.pages.arithmaticCalpage;
import org.openqa.selenium.WebDriver;

public class ArithmaticOperations {

    WebDriver driver;
    arithmaticCalpage arithmaticCalpage;

    public ArithmaticOperations(WebDriver driver){
        this.driver=driver;
        arithmaticCalpage=new arithmaticCalpage(driver);
    }
public int performAddition(int number1 , int number2){
        arithmaticCalpage.number6.click();
        arithmaticCalpage.plus.click();
        arithmaticCalpage.number8.click();
        arithmaticCalpage.equals.click();
        String actualresult= arithmaticCalpage.outputField.getText();
        return Integer.parseInt(actualresult);
}































}
