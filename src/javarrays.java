public class javarrays {
    public static void main(String[] args) {

        int [] array1=new int [4];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        System.out.println(array1.length);

        /*
        int [] array2=new int []{};
        array2[0]=0;
        array2[1]=10;
        System.out.println(array2.length);
*/      int[][] arrayler ={{3,2,1},{6,7,4},{9,0,1}};
        for (int i=0;i<arrayler.length;i++) {
            for (int j = 0; j < arrayler[i].length; j++) {
                System.out.print(arrayler[i][j] + " ");
            }
            System.out.println();
        }

        for (int i : array1) {//array1.for yazib tabe basanda gelir bele qisa yolnan
            System.out.println(i);

        }







    }
}
