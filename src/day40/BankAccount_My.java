package day40;

public class BankAccount_My {
    String accountType;
    String accountHolder;
    long accountNumber;
    double balance;


    //setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder,
                               long newAccountNumber,double newBalance){
        accountType=newAccountType;
        accountHolder=newAccountHolder;
        accountNumber=newAccountNumber;
        balance=newBalance;
    }

    //showAccountBalance

    public void showAccountBalance(){
        System.out.println("my balance = "+balance);
    }

    // showAccountHolderAccountType
    public void showAccountHolderAccountType(){
        System.out.println(" Account holder : "+accountHolder+"\n"+"Account type : "+accountType);

    }
    //getBalance return the Balance
    public double getBalance (){

        return balance;
    }

    //deposit( amount )
    public void deposit(double depositAmount){
        balance+=depositAmount;

    }

    //withdraw( amount )
    public void withdraw (double amount){
        balance-=amount;
    }


    // withdraw100cash()
    public void withdraw100cash(){
        withdraw(100);
    }

    //purchaseProduct(productPrice, count)
    public void purchaseProduct(double productPrice,int count){
        balance=balance-(productPrice*count);
    }
    //toString()



    public String toString() {
        return "BankAccount_My{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
