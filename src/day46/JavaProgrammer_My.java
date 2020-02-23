package day46;

public class JavaProgrammer_My extends Programmer_My {


    void drinkCoffee(){

        super.code();
        System.out.println("Drinking coffee");
    }

    void doRepl(){

        System.out.println("Doing repls");

    }

    @Override
    public void code(){
        System.out.println("Java coding");
    }

   protected   @Override
    void test() {
        super.test();
    }

    public static void main(String[] args) {

        JavaProgrammer_My p1 = new JavaProgrammer_My();
        p1.drinkCoffee();

        p1.doRepl();

        p1.code();

    }

}
