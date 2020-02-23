package day49;

public interface Autonomous_My {

    public abstract void selfDrive();

    public default void voiceDrive(){
        System.out.println("give direction to car with your voice");
    }
    public static void drive (){
        System.out.println("all car is to drive");
    }

}
