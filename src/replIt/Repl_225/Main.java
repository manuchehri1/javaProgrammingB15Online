package replIt.Repl_225;

public class Main {
    public static void main(String[] args) {

        TV tv1= new TV();
        tv1.setVolumeLevel(5);
        System.out.println("tv1.getVolumeLevel() = " + tv1.getVolumeLevel());    
    
   tv1.turnOn();
    tv1.setVolumeLevel(5);
       System.out.println("tv1.getVolumeLevel() = " + tv1.getVolumeLevel());
    }
}
