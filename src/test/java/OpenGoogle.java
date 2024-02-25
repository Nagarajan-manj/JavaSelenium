import com.beust.ah.A;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class OpenGoogle {
    public static void main(String args[]) {
        //System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(options);

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();

        //count rows

        int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        System.out.println("The row count is" + rows);

        //count columns

        int cols = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
        System.out.println("The row count is" + cols);

        //Display particolar cell

        WebElement ele = driver.findElement(By.xpath("//table[@id='customers']//tr[6]/td[3]"));
        System.out.println("The string is :"+" "+ele.getText());

        //Display all

        for(int i=2;i<=rows;i++)
        {
            for(int j=1;j<=cols;j++)
            {

              String st= driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText();
              System.out.println("The strings are"+" "+st);

            }
            System.out.println();
        }
    }
}




