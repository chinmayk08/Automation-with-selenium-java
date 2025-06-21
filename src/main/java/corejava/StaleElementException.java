package corejava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class StaleElementException {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement dragdown= driver.findElement(By.linkText("Drag and Drop"));
        //driver.navigate().refresh();
        //dragdown= driver.findElement(By.linkText("Drag and Drop"));
        dragdown.click();
        WebElement a=driver.findElement(By.id("column-a"));
        WebElement b=driver.findElement(By.id("column-b"));

        Actions action=new Actions(driver);
        action.dragAndDrop(a,b).perform();








    }

}
