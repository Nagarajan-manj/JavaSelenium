package Logintestcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Dynamic
{
    public static void main(String args[])
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        int rows=driver.findElements(By.xpath("//Table[@class='ws-table-all']//tbody/tr")).size();
        System.out.println(rows);

        int cols=driver.findElements(By.xpath("//Table[@class='ws-table-all']//tbody//th")).size();
        System.out.println(cols);

        for(int r=2;r<=rows;r++)
        {
            for(int c=1;c<=cols;c++)
            {
         String com=driver.findElement(By.xpath("//Table[@class='ws-table-all']//tbody/tr["+r+"]/td["+c+"]")).getText();
         //System.out.println(com);
         if(com.equals("Italy"))
         {
             System.out.println(r+":"+c);
             break;
         }

         }

            }

        }


    }


