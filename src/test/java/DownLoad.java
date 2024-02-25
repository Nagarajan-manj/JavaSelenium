import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownLoad
{
    public static  void main(String args[])
    {
       System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        File filelocation=new File("\\Users\\Nagarajan\\Downloads");
        File[]  totalfiles=filelocation.listFiles();

        for (File file: totalfiles)
        {
            if(file.getName().equals("Test.xls"))
            {
                System.out.println("The file is downloaded");
                break;
            }
        }
    }
}
