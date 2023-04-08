package project1;

public class Pet {

    public String species;
    public String nickname;
    public int age;
    public int tricklevel;
    public String habits [];

    public Pet()
    {
    }

    public Pet(String species, String nickname)
    {
        species=this.species;
        nickname=this.nickname;

    }

    public Pet(String species, String nickname, int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }


    public void eat ()
    {
        System.out.println("I am eating");
    }

    public void respond ()
    {
        System.out.println("Hello , owner . I am " + this.nickname +" I miss you");
    }

    public void  foul ()
    {
        System.out.println(" I need to cover it up");

    }



}
