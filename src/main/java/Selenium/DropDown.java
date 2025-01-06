package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement wd = driver.findElement(By.linkText("Dropdown"));
        wd.click();

        WebElement wd1 = driver.findElement(By.id("dropdown"));
        Select dropdown = new Select(wd1);
        dropdown.selectByVisibleText("Option 1");
        WebElement abc = dropdown.getFirstSelectedOption();
        System.out.println(abc.getText());

        List<WebElement> list = dropdown.getOptions();
        for (WebElement webElement : list) {
            String str = webElement.getText();
            System.out.println(str);
        }
    }
}
