import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class Demo
{
    @BeforeClass()
    public void beforeclass()
    {
        System.out.println("Brfore class");
    }

    @AfterClass()
    public void Afterlass()
    {
        System.out.println("After class");
    }

    @BeforeMethod()
    public void Demo1()
    {
        System.out.println("Before executed");

    }
    @Test()
    public void Dem2()
    {
        System.out.println("Welcome Test1");
        //System.out.println("welcome 3");
    }
    @Test()
    public void Dem3()
    {
        System.out.println("Welcome to test2");

    }


    @AfterMethod()
    public void Demo2()
    {
        System.out.println("After Executed");
    }
}
