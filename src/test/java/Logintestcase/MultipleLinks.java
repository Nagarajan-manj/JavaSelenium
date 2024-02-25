package Logintestcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class MultipleLinks
{
    public static void main(String args[])
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.91mobiles.com/");
        driver.manage().window().maximize();
        List<WebElement> link=driver.findElements(By.tagName("a"));

        Integer count=link.size();
        System.out.println("The count is," +count);

        for(WebElement lin:link)
        {
            String str=lin.getText();
            System.out.println(str);
           String lists=lin.getAttribute("href");
           System.out.println("The links are," +lists);
        }


    }
}
