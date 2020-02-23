package day46;

public class AtTheBankClass_My {

    public static void main(String[] args) {
        
        CheckingAccount_My acc1 = new CheckingAccount_My("Hasan",122342,10000);
        
        acc1.deposit(100);
        System.out.println("acc1 = " + acc1);
        acc1.deposit(5000);
        System.out.println("acc1 = " + acc1);

        acc1.withdraw(5300);
        System.out.println("acc1 = " + acc1);
    }
}
