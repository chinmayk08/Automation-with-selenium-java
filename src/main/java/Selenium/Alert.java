package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement JavaScriptAlerts=driver.findElement(By.xpath("//a[text()='JavaScript Alerts']"));
        JavaScriptAlerts.click();

//        WebElement alertmenu=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//        alertmenu.click();
//        driver.switchTo().alert().accept();
//        System.out.println(driver.findElement(By.id("result")).getText());

//        WebElement alertmenuconfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//        alertmenuconfirm.click();
//        driver.switchTo().alert().dismiss();
//        System.out.println(driver.findElement(By.id("result")).getText());

        WebElement clickforprompt= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        clickforprompt.click();
        driver.switchTo().alert().sendKeys("selenium");
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.id("result")).getText());
    }
}
