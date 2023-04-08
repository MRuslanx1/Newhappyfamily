import java.util.Scanner;

public class midterm {
    public static void main(String[] args)
    {

//        Scanner sc=new Scanner(System.in);
//        int   a=sc.nextInt();
////        String s=new String();
////        s=String.valueOf(a);
////
////        for (int i=0;i<s.length();i++)
////        {
////            if (i==s.length()-1)
////            {
////                System.out.print(s.charAt(i));
////
////            }
////
////        }
//        long res;
//        if(a>=13)
//        {
//            res=3*(a*a*a)+4*(a*a)+5*a+6;
//
//        }
//        else
//        {
//            res=3*(a*a*a)-2*(a*a)-3*a-4;
//
//        }
//        System.out.println(res);

        Scanner con = new Scanner(System.in);

        long y, x = con.nextLong();



        if (x <-4)

            y = x+5;

        else if(x>=-4 && x<=7)

            y = x*x - 3*x;
        else
            y=x*x*x+2*x;



        System.out.println(y);











    }
}
