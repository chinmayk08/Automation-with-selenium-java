package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://the-internet.herokuapp.com/");

        /*TakesScreenshot screenshot= (TakesScreenshot) wd;
        File file1= screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file1,new File("screenshot1.jpg"));*/



        WebElement heading = wd.findElement(By.className("heading"));
        File file2 = heading.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file2, new File("C:\\Users\\Acer\\Desktop\\Automation testing\\screenshot2.jpg"));
    }

}
