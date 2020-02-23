package day52.my_practice;

public class PaperBook extends Book implements Readable {

    //        --- concreate
//        PaperBook
//        int weight
//        -- add cosntructor to set all the fileds
//        implement abstract method
//        instance method
//        read()
//        toString()

    int weight;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    @Override
    public void read(){
        System.out.println("Reading the "+this.name+" book of "+this.author);
    }


    @Override
    public void displayBookInfo() {
        System.out.println("The name of book is "+this.name+" and the author of book is "+this.author);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("taking some note from "+this.name);
    }
}
