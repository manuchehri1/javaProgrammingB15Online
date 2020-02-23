package replIt.Repl_224;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public String toString(){
        return this.firstName+" | " +this.lastName+" | "+ this.age;
    }

    public Person(){

    }

    public Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
}
