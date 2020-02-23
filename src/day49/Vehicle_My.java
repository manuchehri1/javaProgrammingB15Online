package day49;

public abstract class Vehicle_My implements Autonomous_My{

    int year;
    public Vehicle_My(int year){
        this.year=year;
    }

    public abstract void start();

    public void goForward(){
        System.out.println("My vehicle is going forward");
    }

}
