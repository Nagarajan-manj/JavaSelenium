package Logintestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DroDown {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        Select se = new Select(driver.findElement(By.id("oldSelectMenu")));
        List<WebElement> li = se.getOptions();

        se.selectByIndex(5);
        System.out.println("Select value is: " + se.getFirstSelectedOption().getText());




        for (WebElement dr : li) {

            if(dr.getText().equals("Red"))
            {
                dr.click();
                System.out.println("The buttons are:==" +dr.getText());
                break;
            }
        }
    }
}
