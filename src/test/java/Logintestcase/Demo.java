package Logintestcase;

import org.testng.Assert;
import org.testng.annotations.*;


public class Demo {
    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{2, 3 , 5},{1,1,3}};
    }

    @Test (dataProvider = "data-provider")
    public void myTest (int a, int b, int result) {
        int sum = a + b;
        System.out.println("The result is:==," +result);
        System.out.println("The sum is:==,"+sum);
        Assert.assertEquals(result, sum);
    }
}