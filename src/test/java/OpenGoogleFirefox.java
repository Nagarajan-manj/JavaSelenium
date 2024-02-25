import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class OpenGoogleFirefox
{
    public static void main(String args[]) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver;
        driver=new ChromeDriver();

        //driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.get("https://jqueryui.com/resizable/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.switchTo().frame(0);


        WebElement source=driver.findElement(By.xpath("//*[@class='ui-widget-content ui-resizable']"));
        //*[@id="resizable"]


        Actions act=new Actions(driver);

        act.moveToElement(source).dragAndDropBy(source,50,100).build().perform();
        //Thread.sleep(300);

    }

}
