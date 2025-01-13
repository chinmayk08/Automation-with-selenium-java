package Project.businessLib;

import Project.pages.CalculatorPage;
import org.openqa.selenium.WebDriver;

public class ArithmaticOperations {

    WebDriver driver;
    CalculatorPage arithmaticCalpage;

    public ArithmaticOperations(WebDriver driver) {
        this.driver = driver;
        arithmaticCalpage = new CalculatorPage(driver);
    }

    public int performOperation(String operation, int... numbers) {

        arithmaticCalpage.back.click();

        int count=numbers.length;

        for (int number: numbers){
            String numberString=String.valueOf(number);

            for(int i=0; i<numberString.length();i++){
                char numberchar= numberString.charAt(i);
                if(Character.isDigit(numberchar)){
                    int digit=Character.getNumericValue(numberchar);
                    clickNumber(digit);
                }
                else{
                    clickSign(numberchar);
                }

            }
            count--;
            if (count!=0){
                clickoperation(operation);
            }
        }

        arithmaticCalpage.equals.click();
        String actualresult = arithmaticCalpage.outputField.getText().trim();
        return Integer.parseInt(actualresult);
    }

    private void clickNumber(int number) {
        switch (number) {

            case 0:
                arithmaticCalpage.number0.click();
                break;

            case 1:
                arithmaticCalpage.number1.click();
                break;

            case 2:
                arithmaticCalpage.number2.click();
                break;

            case 3:
                arithmaticCalpage.number3.click();
                break;

            case 4:
                arithmaticCalpage.number4.click();
                break;

            case 5:
                arithmaticCalpage.number5.click();
                break;

            case 6:
                arithmaticCalpage.number6.click();
                break;

            case 7:
                arithmaticCalpage.number7.click();
                break;

            case 8:
                arithmaticCalpage.number8.click();
                break;

            case 9:
                arithmaticCalpage.number9.click();
                break;
        }
    }
    private void clickoperation(String operation) {
        switch (operation) {
            case "Add":
                arithmaticCalpage.plus.click();
                break;

            case "minus":
                arithmaticCalpage.minus.click();
                break;

            case "divide":
                arithmaticCalpage.divide.click();
                break;

            case "multiply":
                arithmaticCalpage.multiply.click();
                break;
        }
    }

    public void clickSign(char sign){
        switch(sign){
            case '-':
                arithmaticCalpage.minus.click();
                break;
        }

    }
}
