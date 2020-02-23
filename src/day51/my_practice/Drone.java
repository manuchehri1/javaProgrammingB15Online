package day51.my_practice;

public class Drone implements UprightFlyable {


    @Override
    public void flyUpright() {
        System.out.println("flying upright");
    }

    @Override
    public void fly() {
        System.out.println("flying regularly");
    }
}
