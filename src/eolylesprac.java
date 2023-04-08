import java.util.Scanner;

public class eolylesprac {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        out_label:
        for(int i=0;i<10;i++)
        {
            inn_label:
            for (int j=0;j<10;j++)
            {
                if (i==3)
                {
                    break inn_label;
                }
                System.out.println(i + " "+ j);

            }
        }

        /*
        int i =1;




        do {

            if (i == 5) {
                break;
            }
            System.out.println(i);
            i++;
        } while(i<=10);

        int n=1;
        while (n<=10)
        {
            if (n==3){break;}
            System.out.println(n);
            n++;


        }


        for (int i=1;i<=5; i++)
            for(int j=1;j<=5;j++)


            {
                if (i==3){break;}
                System.out.println("first =" +  i + "second" + j);
            }






        int x=sc.nextInt();
        int y=sc.nextInt();
        if (x<y){
            System.out.printf("%d %d",x,y);
        }
        else
        {
            System.out.printf("%d %d",y,x);
        }







        int x=sc.nextInt();
        if (x>0){
            System.out.println("Positive");
        } else if (x==0) {
            System.out.println("Zero");

        }
        else{
            System.out.println("Negative");
        }


        int x=sc.nextInt();
        int z;
        if(x>=5){
            z=x+7;
        }
        else
        {
            z=x*x - 3*x + 4;
        }
        System.out.println(z);


        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a%b==0)
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.printf("%d %d",a/b,a%b);
        }
        /*
        int n=sc.nextInt();
            if ( (n / 1000) == (n % 10) &&  (n / 100 % 10) == (n / 10 % 10) ) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }


        int n=sc.nextInt();
        if (n/1000!=0 && n/100%10!=0 && n/10%10!=0 && n%10!=0) {
            if (n % (n / 1000) == 0 && n % (n / 100 % 10) == 0 && n % (n / 10 % 10) == 0 && n % (n % 10) == 0) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
        else {
            System.out.println("NO");
        }


        boolean flag=true;
        int n=sc.nextInt();
        if (n>0){
            System.out.println("Water");
        }
        else{
            System.out.println("Ice");
        }

        while(n>0)
        {
            if (n%(n%10)!=0)
            {
                flag=false;
            }
            n/=10;

        }
        if (flag==true){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }



        int n=sc.nextInt();
        if (n/1000 %2==0 &&  n/100%10%2==0 && n/10%10%2==0 && n%10%2==0)
        {
            System.out.println("YES");

        }
        else {
            System.out.println("NO");
        }

        int n=sc.nextInt();
        if (n/1000 %2==1 ||  n/100%10%2==1 || n/10%10%2==1 || n%10%2==1)
        {
            System.out.println("YES");

        }
        else {
            System.out.println("NO");
        }

        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n-2);
        }
        else {
            System.out.println(n-1);
        }

        if (i<0)
            i=-1*i;
        while(i>0)
        {
            System.out.println(i%10);
            i/=10;
        }

        //System.out.println(Integer.MAX_VALUE);

        if (i%2==0)
            System.out.println("even");
        else
            System.out.println("odd");


        while (i>0)
            if ((i-1)%2!=0) {
                System.out.println(i-1);
                break;
            }
            else{
                i--;
            }


         */




    }
}
