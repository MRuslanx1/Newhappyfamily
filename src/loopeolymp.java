import java.util.Scanner;

public class loopeolymp {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y =sc.nextInt();

        for(int i=y;i>=x;i--)
        {

                System.out.println(i);

        }

        /*
        long number= sc.nextLong();
        if (number<0)
        {
            number=number*(-1);
        }
        long x=number;
        long reverse=0;
        while(number != 0)
        {
            long  remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }

        System.out.println(reverse%10+x%10);


        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            System.out.println(i+" OK");
        }

        long a=sc.nextLong();
        int cnt=0;
        int i=1;
        long sum=0;
        while(true)
        {

            sum+=i;
            i++;
            cnt++;
            if (sum%a==0)
            {break;}



        }


        System.out.println(cnt);

        long max_=0;
        while(a>0) {

            if (a % 10 %2==1)
            {
                max_++;

            }
            a /= 10;

        }

        System.out.println(max_);




        long a=sc.nextLong();
        long max_=a%10;
        while(a>0) {

            if (a % 10 > max_)
            {
                max_=a%10;

            }
            a /= 10;

        }

        System.out.println(max_);



        int a=sc.nextInt();
        int sum=0;
        if (a<0){a=a*-1;}
        while(a>0)
        {
            sum+=a%10;
            a/=10;

        }
        System.out.println(sum);


        int b=sc.nextInt();
        int cnt=0;
        while(a/b>1)
        {
            cnt++;
            a=a/b;

        }
        System.out.println(cnt);


        int t=sc.nextInt();
        int count=0;

        while(t>0)
        {
            count+=1;
            int n=t;
            int sum=0;
            while(n>0) {
                sum += n % 10;
                n /= 10;


            }
            t=t-sum;



        }
        System.out.println(count);





        int n=sc.nextInt();
        for()
        {

        }

        int cnt=0;
        int cnt1=0;

        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            if (n==1)
            {
                cnt1++;
            }
            else {cnt++;}
        }

        if (cnt>cnt1){
            System.out.println(cnt1);
        }
        else
        {
            System.out.println(cnt);
        }

        int t=sc.nextInt();
        for (int i =0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.println(a+b);
        }







        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int count=0;
        if (n==0)
        {
            System.out.println(1);
        }

        else {
            while (n > 0) {
                count += 1;
                n /= 10;
            }
            System.out.println(count);
        }

         */
    }
}
