package day49;

public class Tesla_My extends Vehicle_My {

    String model;
    int horsePower;


    public Tesla_My(String model, int horsePower, int year){
        super(year);
        this.model=model;
        this.horsePower=horsePower;
    }

    @Override
    public void start() {
        System.out.println("Say start to drive the car");
    }
    @Override
    public void selfDrive(){
        System.out.println("The vehicle is at auto drive mode");
    }
}
