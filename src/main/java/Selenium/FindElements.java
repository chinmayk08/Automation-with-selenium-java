package Selenium;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FindElements {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement sortabledata=driver.findElement(By.xpath("//a[text()='Sortable Data Tables']"));
        sortabledata.click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> abc=driver.findElements(By.xpath("//*[@id='table1']/thead/tr/th"));
        for (WebElement webElement: abc){
            String str=webElement.getText();
            System.out.println(str);
        }
    }
}