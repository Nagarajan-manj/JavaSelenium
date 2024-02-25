import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Prac {
    public static void main(String args[]) throws IOException, InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://google.com");
       WebElement se= driver.findElement(By.xpath("//*[@class=\'gLFyf\']"));
       se.sendKeys("Test");
       driver.manage().window().maximize();
       se.sendKeys(Keys.TAB);
       driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]//child::input[@class=\'gNO89b\']")).click();
       //driver.findElement(By.xpath("//*[class='gNO89b']")).click();

    }
    }



