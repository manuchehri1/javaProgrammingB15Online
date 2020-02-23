package day51.my_practice;

import day50.Shape;

public class AnimalShow {


    public static void main(String[] args) {


       // Dog d1 = new Dog();

        Animal a1 = new Dog();
        a1.makeNoise();
        Animal a2 = new Horse();
        Animal a3 = new Tiger();




        // reassigning a1 to different object
       // a1 = new Horse();
      //  a1.makeNoise();

        Animal [] manyAnimal = {a1,a2,a3};
        System.out.println("===========");

        for (Animal eachAnimal : manyAnimal) {
            eachAnimal.makeNoise();
        }




    }

}
