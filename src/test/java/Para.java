import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para
{
    @Test
    @Parameters({"val1","val2"})
    public void sum(int v1,int v2)
    {
        int finalsum=v1+v2;
        System.out.println("The result is=="+" "+finalsum);
    }
}
