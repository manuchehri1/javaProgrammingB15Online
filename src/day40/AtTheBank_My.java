package day40;

public class AtTheBank_My {
    public static void main(String[] args) {

        BankAccount_My b1= new BankAccount_My();

        b1.setAllTheValue("saving","Jackson",
                          123412341,30000);
        b1.showAccountBalance();

        b1.withdraw(3200);

        b1.showAccountBalance();

        b1.purchaseProduct(199.99,5);

        b1.withdraw100cash();

        System.out.println(b1);



    }
}
