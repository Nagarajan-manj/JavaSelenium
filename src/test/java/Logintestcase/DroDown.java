package Logintestcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DroDown {
    public static void main(String args[]) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/social-icon.html");

        Actions ac=new Actions(driver);

        WebElement ele = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-github']//following::a[6]"));
        System.out.println(ele);

        String tool = ele.getAttribute("title");

        System.out.println(tool);
    }
}





