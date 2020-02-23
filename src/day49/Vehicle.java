package day49;

public abstract class Vehicle implements Autonomous_My {
    int year;

    public Vehicle() {
    }


    public Vehicle(int year) {
        this.year = year;
    }

    public abstract void start();

    public void goForward() {
        System.out.println("Vehicle going forward");
    }

}
