public class exceptions2
{
    public static void main(String[] args)
    {
        divided(120,0);



    }
    public static void divided ( int a , int b)
    {
        if (b==0)
        {
            throw new ArithmeticException( ("bolen 0 ola bilmez "));

        }
        int c=a/b;
        System.out.println(c);
    }
}
