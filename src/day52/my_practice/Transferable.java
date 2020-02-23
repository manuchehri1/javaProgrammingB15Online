package day52.my_practice;

public interface Transferable {

    public abstract void transferAll(Account otherAccount);

    public abstract void transferAmount(Account otherAccount, int amount);
}
