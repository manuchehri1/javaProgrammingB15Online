package replIt.Repl_223;

public class Main {
    public static void main(String[] args) {

        Calc a = new Calc();
        a.setX(1);
        a.setY(1);
        a.plus();
        System.out.println("1+1 = "+ a.getResult());//1+1 = 2
        a.minus();
        System.out.println("a.getResult() = " + a.getResult());

    }
}
