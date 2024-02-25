import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import ru.yandex.qatools.ashot.Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Interviewpgms
{
    public static void main(String args[]) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        //  driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://jqueryui.com/tooltip/");

//        TakesScreenshot tscr=(TakesScreenshot) driver;
//         File src=tscr.getScreenshotAs(OutputType.FILE);
//         File tar=new File(".\\Screenshot\\homepage.png");
//         FileUtils.copyFile(src,tar);
//
        driver.switchTo().frame(0);
       WebElement sur=driver.findElement(By.xpath("//input[@id='age']"));
       String str=sur.getAttribute("title");
       System.out.println(str);
         driver.close();
    }
}
