package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement ab=driver.findElement(By.linkText("Checkboxes"));
        ab.click();

        WebElement bc=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        bc.click();

        WebElement bc1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        bc1.click();

        System.out.println("check box 1 selected is "+bc.isSelected());
        System.out.println("check box 2 selected is "+bc1.isSelected());


        

    }
}
