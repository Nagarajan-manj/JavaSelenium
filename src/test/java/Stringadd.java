public class Stringadd
{
    public  static void main(String args[])
    {
        String str="abcdefg12tehhfui45jlmn";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                sum=sum+Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);


    }
}
