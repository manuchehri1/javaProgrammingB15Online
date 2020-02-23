package day39;

public class CarCreation {
    public static void main(String[] args) {

        Car car1= new Car();
        Car car2=new Car();


        car1.year=2020;
        car1.make= "Toyota";
        car1.model="Corolla";
        car1.color= "White";
        car2.year =2020;
        car2.make= "Tesla";
        car2.model="X";
        car2.color="blue";

        System.out.println("[ "+car1.make+", "+car1.model+", "+car1.year+", "+car1.color+" ]" );


    }
}
