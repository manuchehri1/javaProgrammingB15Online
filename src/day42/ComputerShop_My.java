package day42;

public class ComputerShop_My {
    public static void main(String[] args) {

        Computer_My c1= new Computer_My();

        c1.setBrand("Apple");
        c1.setRam(16);
        c1.setPrice(730);

        c1.runProgram();
        c1.calculate();

        Computer_My c2 =new Computer_My();

        int myRam =c1.getRam();
        System.out.println("myRam = " + myRam);

        c2.setBrand("HP");
        c2.setPrice(c1.getPrice()/2);
        c2.setRam(c1.getRam()/4);

        System.out.println("c2 = " + c2);

    }


}
