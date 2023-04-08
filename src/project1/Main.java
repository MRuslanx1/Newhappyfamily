package project1;

public class Main {

    public static void main(String[] args) {
        Pet mypet = new Pet("dog","bulldog",12, 56,new String[] {"playing"," jumping "});
        mypet.eat();
        mypet.respond();
        Human mymother = new Human ( "Mother"," Murtuzova" ,1975);
        Human myfather = new Human ( "Fther"," Murtuzov" ,1980);

        Human ruslan = new Human("Ruslan","Murtuzov",2004, mymother, myfather  );

        ruslan.describePet();


    }



}
