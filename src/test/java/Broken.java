import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Broken {
    public static void main(String args[]) throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        driver.manage().window().maximize();

        //driver.findElement(By.partialLinkText("Deals")).click();
        List<WebElement> co = driver.findElements(By.tagName("a"));
        //System.out.println("The counts are: " +co.size());

        for (WebElement si : co) {

            String urls = si.getAttribute("href");

                URL url = new URL(urls);

                //Now we will be creating url connection and getting the response code
                HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
                httpURLConnect.setConnectTimeout(5000);
                httpURLConnect.connect();
                if (httpURLConnect.getResponseCode() >= 400) {
                    System.out.println(httpURLConnect.getResponseMessage() + "is a broken link");
                }
            }
        }
    }


                //Fetching and Printing the response code obtained
//                else {
//                    System.out.println( httpURLConnect.getResponseMessage());
//                }
//            }catch(Exception e){
//            }
//        }
