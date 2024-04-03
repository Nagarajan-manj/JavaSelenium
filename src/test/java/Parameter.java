import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter
{
    @Test
    @Parameters("Name")
    void display(String name)
    {
        System.out.println("The name is=="+name);
    }
}
