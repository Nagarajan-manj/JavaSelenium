import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Desire {
    public static void main(String args[]) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        //  driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.w3schools.com/html/html_tables.asp");

        //int col = driver.findElements(By.tagName("th")).size();
        int cols = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
        //System.out.println(col.size());

//        for(WebElement co:col)
//        {
//            System.out.println(co.getText());
//        }


        //int rows = driver.findElements(By.tagName("tr")).size();
        int rows = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        //System.out.println(rows.size());

        for (int r = 2; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                String cou = driver.findElement(By.xpath("//table[@id='customers']//tr[" + r + "]//td[" + c + "]")).getText();
                if (cou.contains("Maria Anders")) {
                    System.out.println(r + " : " + c);
                    break;
                }
                //Thread.sleep(5000);
                //   String cer=cou.getText();
//                System.out.print(cou + "\t");
//            }
//            System.out.println();
//            }

//        WebElement ele= driver.findElement(By.xpath("//td[contains(text(),'Alfreds Futterkiste')]//following::td[1]"));
//        String per=ele.getText();
//        System.out.println(per);
            }
        }
    }
}





