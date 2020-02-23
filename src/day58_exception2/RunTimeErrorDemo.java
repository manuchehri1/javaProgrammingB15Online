package day58_exception2;

public class RunTimeErrorDemo {

    static int num=0;

    public static void main(String[] args) {
        num++;
        System.out.println("num = " + num);
        // calling main method
        main(null);
    }
}
