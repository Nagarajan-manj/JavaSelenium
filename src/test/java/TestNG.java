import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG
{

    @Test(timeOut = 2000)
    void startcar() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Start car execute");
       // Assert.fail();
    }
    @Test(dependsOnMethods = {"startcar"},alwaysRun = true)
    void drivecar()
    {
        System.out.println("drive car execute");
    }

}




    