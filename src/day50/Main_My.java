package day50;

public class Main_My {

    public static void main(String[] args) {


        Square_My s1 = new Square_My("my precious", 10);
        System.out.println("s1 without area calculation = " + s1);
        s1.calculateArea();
        System.out.println("s1 with area calculation = " + s1);
        s1.draw();
        System.out.println("============================");

        Circle_My c1 = new Circle_My("Nan", 5);
        System.out.println("c1 without area calculation = " + c1);
        c1.calculateArea();
        System.out.println("c1 with area calculation = " + c1);
        c1.draw();
        
        Object c3 = new Circle_My("my circle",10);
        System.out.println("c3 = " + c3);

    }

}
