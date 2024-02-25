import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Demo
{


    @BeforeMethod()
    public void Demo1(){
        System.out.println("Before executed");
    }
    @Test()
    public void Dem2()
    {
        System.out.println("Welcome2");
    }


    @AfterMethod()
    public void Demo2()
    {
        System.out.println("After Executed");
    }
}
