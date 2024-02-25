import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro
{
    @DataProvider(name="data-provider")
    public Object[][] calculate()
   {
       return new Object[][] {{"FirstValue"},{"Secondvalues"}};
  }

     @Test(dataProvider="data-provider")
    public void mytest(String val)
     {
         System.out.println("The parameter is" +val);
     }
}
