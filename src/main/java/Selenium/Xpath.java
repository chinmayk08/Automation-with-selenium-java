package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net");

        //Absulute xpath(/), relative xpath(//)

        //Syntax:---
        //<tagname>[@<attribute>='<attribute value>']


        //id
        WebElement abc= driver.findElement(By.xpath("//input[@id='bluebtn']"));

        //contains
        WebElement search1= driver.findElement(By.xpath("//a[contains(text()),'fitness']"));

        //text
        WebElement number= driver.findElement(By.xpath("//span[text()='5']"));

        //with index xpath
        WebElement number2= driver.findElement(By.xpath("form[@name='calcSearchForm']//tr[1]/td[1]"));


    }
}
