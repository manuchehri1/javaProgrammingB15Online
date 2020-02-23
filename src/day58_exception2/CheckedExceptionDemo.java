package day58_exception2;

public class CheckedExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Checked Exception in next Line");
        try {
            Thread.sleep(1000); // pause for 1000 millisecond = 1 second
        }catch (InterruptedException e){

        }
            System.out.println("java");
    }
}

class CheckedExceptionDemo2{
    public static void main(String[] args) throws Exception {
        System.out.println("Checked Exception in next Line");

            Thread.sleep(1000); // pause for 1000 millisecond = 1 second

        System.out.println("java");
    }
    }
