package day46;

public class BankAccount_my {
    String accountHolder;
    long accountNum;
    double balance;

    public BankAccount_my(String accountHolder, long accountNum, double balance) {
       // super();  ---> we have this by default in this first line of constructor always
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }
    public BankAccount_my(){

    }

    public void deposit(int amount){
        balance+=amount ;  //this.balance+=amount; ---> this also work
    }

    public void withdraw(int amount){
        balance-=amount ;
    }



}
