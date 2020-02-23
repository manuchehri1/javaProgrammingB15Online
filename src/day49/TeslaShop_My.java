package day49;

public class TeslaShop_My {
    public static void main(String[] args) {
        Tesla_My t1 = new Tesla_My("Tesla",320,2019);


        t1.start();
        t1.selfDrive();
        t1.goForward();
        t1.voiceDrive();
        Autonomous_My.drive();
    }



}
