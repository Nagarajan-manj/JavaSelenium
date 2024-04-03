package Logintestcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Nivin
    {
        @DataProvider(name="Login")
        public Object[][] demo()
        {
            return new Object[][]
            {
                {"Firstvalue"},{"Secondvalue"}

            };
        }

        @Test(dataProvider = "Login")
        public void display(String val)
        {
            System.out.println("The value is"+val);
        }

    }




