package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net");


        //ID Locator
//        WebElement searchbox= driver.findElement(By.id("calcSearchTerm"));
//        searchbox.sendKeys("ABC");

        //Name locator
//        WebElement searchbox1= driver.findElement(By.name("calcSearchTerm"));
//        searchbox1.sendKeys("ABC");

        //Class name, tag name,
//        WebElement searchbox1= driver.findElement(By.tagName("title"));
//        driver.getTitle();

        //linkedtext & partial linkedtext
        WebElement searchbox1= driver.findElement(By.linkText("BMI Calculator"));
        searchbox1.click();
        driver.navigate().back();


        WebElement searchbox2= driver.findElement(By.partialLinkText("Sales Tax"));
        searchbox2.click();

        //Absulute xpath(/), relative xpath(//)







    }
}
