//basqa packageden goturukse import tpackname.classneme; yaziriq

public class oop1
{
    String name;
    String surname;

    public oop1() {
        System.out.println("Test");
    }

    public oop1(String name2) {
        name = name2;
    }

    public void read()
    {
        System.out.println("Read");

    }
    static{//static yazsaq static block yaranir ve bu classa aid olur hansi obyekt cagirilsa o qeder cixmis olur
        // ama qabagina statuc yazmasaq bu olacaq instance ve nece obyekt yaradilsa o qeder cagirilmis olacaq
        int a=35;//block
        System.out.println(a);
    }

    class Test
    {

    }

    interface Test2
    {

    }



}
