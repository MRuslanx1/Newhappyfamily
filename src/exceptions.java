public class exceptions {
    public static void main(String[] args) {
        try {
            int data =100/0;
            int [] a= new int[5];
            a[8]=30/0;
            System.out.println(data);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("array exceeds length");
        }
        catch(Exception ex)
        {
            System.out.println("main exception");
        }
        finally
        {
            System.out.println("end of the code");
        }

    }
}
