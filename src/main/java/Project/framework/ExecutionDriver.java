package Project.framework;

import corejava.Static.Static;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExecutionDriver {
    public static WebDriver driver;

    @BeforeSuite
    public void ExecutionDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net");
    }
    @AfterSuite
    public void aftersuit(){
        //driver.quit();
    }
}
