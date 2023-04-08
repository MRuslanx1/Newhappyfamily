public class ooppractice1
{

    public int id;
    public  String name;


    public ooppractice1(int id, String name )
    {
        this.id=id;
        this.name=name;

    }

     static String group="Java QA";


    static {
        System.out.println("static works");
        group=" java qa automation";
    }

    public static void main(String[] args) {
        System.out.println("main works");
        System.out.println(group);
    }


    public static int  product(int a,int b)
    {
        return a*b;


    }



}
