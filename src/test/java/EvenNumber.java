import java.util.Scanner;

public class EvenNumber
{
    public static  void main(String args[])
    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter numbers");
//        int n=sc.nextInt();
        int n=6;
        int count=0;
        for(int i=1;i<=n;i++)
            if((i%2)!=0)
                count++;
                //System.out.println("The total numner of odd number 1 to "+n+" is:"+count);
        System.out.println(count);



    }
    }

