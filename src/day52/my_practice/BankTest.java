package day52.my_practice;

public class BankTest {
    public static void main(String[] args) {
        Account a1 = new Account("John Snow", 10000);
        Account a2 = new Account("Arya Stark",7000);

        System.out.println("a1 before = " + a1);
        System.out.println("a2 before = " + a2);

        a1.transferAll(a2);

        System.out.println("a1 after = " + a1);
        System.out.println("a2 after = " + a2);

        a2.transferAll(a1);

        System.out.println("a1 after = " + a1);
        System.out.println("a2 after = " + a2);

        a1.transferAmount(a2, 1000);
        System.out.println(" ===============");
        System.out.println("a2 = " + a2);
        System.out.println("a1 = " + a1);

    }




}
