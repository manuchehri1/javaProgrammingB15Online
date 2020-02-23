package day46;

public class SavingAccount_My extends BankAccount_my {
//    String accountHolder; we have inherited all
//    long accountNum;      this three instance
//    double balance;       variables from BankAccount class
    double interestRate ;

    public SavingAccount_My(String accountHolder, long accountNum, double balance, double interestRate) {
        super(accountHolder, accountNum, balance); // this means that we dont have to assign tree instance again in here
        this.interestRate = interestRate;          // super(); constructor make for use ( less code) 
    }

    @Override 
    public String toString() {     // this method is in Object class and we are overriding it in our sub class
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }
    @Override
    public void withdraw(int amount){ 
        
        balance=balance-amount-30;  // same method name and parameter bud different implementation 
    }
    @Override
    public void deposit(int amount){
//        super.deposit(amount);
//        super.deposit((int) ((interestRate/100)*amount));
        balance += amount+amount*interestRate;
        int actualAmount = (int) (amount+amount*interestRate);
       // super.deposit(actualAmount);
    }

    public static void main(String[] args) {
        SavingAccount_My s1 = new SavingAccount_My("Mohammad",1242431,500, 0.042);

        System.out.println("s1.toString() = " + s1.toString());
        
      //  s1.withdraw(10000);

      //  System.out.println("s1 = " + s1);
        s1.deposit(100);
        System.out.println("s1 = " + s1);
        
        
    }
    
    
    

}
