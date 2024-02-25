public class Fibo
{
    public static void main(String args[])
    {
        int num=5;
        int a=0;
        int b=0;
        int c=1;

        for(int i=1;i<=num;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");


        }
    }
}
