package day43;

import java.util.Arrays;
import java.util.List;

public class PetStore {
    public static void main(String[] args) {
//        Create 8 Pet objects with initial value
////        Store them into a List<Pet>
////        1, print out all info
////        2, print out only name
////        3, print out only cats

        Pet p1= new Pet();
        Pet p2 = new Pet();
        Pet p3= new Pet();
        Pet p4= new Pet();
        Pet p5= new Pet();
        Pet p6= new Pet();
        Pet p7= new Pet();
        Pet p8= new Pet();

        List<Pet> myPets=(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8));




    }
    public static void allInfoOfMyPet(Pet p){
        System.out.print("Breed is "+p.getBreed());
        System.out.print(" and name is "+p.getName());
    }

}
