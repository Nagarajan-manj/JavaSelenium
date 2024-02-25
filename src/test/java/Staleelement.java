import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staleelement
{
    public static void main(String args[]) throws InterruptedException {

       WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0ixy5tp8avh6816k23shbkwfzi13987.node0");

        driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0ixy5tp8avh6816k23shbkwfzi13987.node0");
        driver.manage().window().maximize();

        WebElement link= driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
        link.click();
        driver.navigate().back();

        Thread.sleep(300);

        try {
            link.click();
        }catch (StaleElementReferenceException e)
        {

            link= driver.findElement(By.xpath("//button[@id='j_idt88:new']"));
            link.click();

        }

    }
}
