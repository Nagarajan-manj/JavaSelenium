package Logintestcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CorrectLogin
{

    @DataProvider(name="nivin")
    public String[][] Naga()
    {
        return new String[][]{
                {"Admin", "admin123"},
                {"Admin","admin432"},
                {"Test12","demo123"}
        };

    }
    @Test(dataProvider = "nivin")
     public void Login(String uname,String pass)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver(options);


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username1 = driver.findElement(By.name("username"));
        username1.sendKeys("uname");
        WebElement password1 = driver.findElement(By.name("password"));
        password1.sendKeys("pass");
        WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
        sub.click();
        driver.quit();
    }
}

