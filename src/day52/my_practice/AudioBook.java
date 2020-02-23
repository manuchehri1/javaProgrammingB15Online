package day52.my_practice;

public class AudioBook extends Book{

    //        AudioBook
//        double duration
//        implement abstract method
//        instance method
//        listen()
//        toString()

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration=duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("The name of book is "+this.name+" and the author of book is "+this.author);

    }
    public void listen(){
        System.out.println("Listening the "+"\""+this.name+"\""+" book of "+this.author);

    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("taking some note from "+this.name+ " book");
    }

    @Override
    public void showTableOfContent() {
        System.out.println("showing the table content of "+this.name);
    }
}
