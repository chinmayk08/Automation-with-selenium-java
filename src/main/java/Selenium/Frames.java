package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeDriver wd=new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("https://the-internet.herokuapp.com/");

        WebElement frame=wd.findElement(By.xpath("//a[text()='Nested Frames']"));
        frame.click();

        /*System.out.println("---------print html top code----------");
        WebElement topframe= wd.findElement(By.name("frame-top"));
        wd.switchTo().frame(topframe);
        System.out.println(wd.getPageSource());*/



        System.out.println("-------print html middle code---------");
        WebElement middleframe=wd.findElement(By.name("frame-middle"));
        wd.switchTo().frame(middleframe);
        System.out.println(wd.getPageSource());
        wd.switchTo().parentFrame();
        System.out.println("------print html right code---------");

        WebElement rightframe=wd.findElement(By.name("frame-right"));
        wd.switchTo().frame(rightframe);
        System.out.println(wd.getPageSource());

        wd.switchTo().defaultContent();
        System.out.println("------print html code bottom---------");
        WebElement bottomframe=wd.findElement(By.name("frame-bottom"));
        wd.switchTo().frame(bottomframe);
        System.out.println(wd.getPageSource());

    }
}
