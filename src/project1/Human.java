package project1;

import java.util.Arrays;

public class Human {

    String name;
    String surname;
    int year;
    int IQ;
    Pet pet;
    Human mother;
    Human father;

    String schedule[] [] ;

    public void greetPet ()
    {
        System.out.println("Hello " + pet.nickname);

    }

    public void describePet ()
    {
        if (pet.tricklevel <50 )
            System.out.println("Hello , I have " + pet.species + " he is " + pet.age +  " years old, he is   sly  " );
        else
            System.out.println("Hello , I have " + pet.species + " he is " + pet.age +  " years old, he is almost sly  " );
    }

    public Human(String name, String surname, int year) {

        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human() {

    }

    public Human(String name, String surname, int year, int IQ, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }




    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", IQ=" + IQ +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
