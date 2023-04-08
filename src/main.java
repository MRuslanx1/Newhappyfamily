import java.io.FileOutputStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class main
{
    public static void main(String[] args)  {
        try {
            FileWriter file = new FileWriter ("Users/RUSLAN/Desktop/file.txt");
            file.write("hello");

            file.close();
            FileOutputStream myfile= new FileOutputStream("/Users/RUSLAN/Desktop/file.txt");

            String text= "welcome Java coursessss";
            byte[] bytes = text.getBytes();
            myfile.write(bytes);
        //flush file a yazilam axinini silir
         //close file i bagliyir



            int i = myfile.read();
            char c1 = (char) i;
            System.out.println(c1);
            while (i != -1) {
                int i2 = myfile.read();
                char c2 = (char) i2;
                System.out.println(c2);//print qoysaq ard arda yazacaq
                myfile.close();
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }


        /*

        ooppractice1 item1=new ooppractice1(3,"salam");

        System.out.println(item1.id );


        System.out.println(item1.product(3,4));


        oop1 stud =new oop1();
        oop1 stud2=new oop1("salam");
        stud.read();
        System.out.println(stud.name);
        System.out.println(stud2.name);


        employer emp1=new employer();
        //emp1.address.number=10;
        System.out.println(emp1.address.number);
        System.out.println(emp1.address.name);


         */

    }
}
