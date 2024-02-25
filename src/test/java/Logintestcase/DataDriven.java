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

public class DataDriven {

    @DataProvider(name = "Tests")
    public String[][] demo() {
        return new String[][]
                {
                        {"Admin", "admin123"},
                        {"Admins", "adminwer"}
                };
    }
    @Test(dataProvider="Tests")
    public void CorrLogin(String uname,String pword) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys(uname);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(pword);
        WebElement sub=driver.findElement(By.xpath("//button[@type='submit']"));
        sub.click();
        driver.quit();
    }
}

