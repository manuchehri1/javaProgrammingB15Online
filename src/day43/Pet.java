package day43;

public class Pet {

  private   String breed;
  private String name;

     public  Pet(){
       this.breed="uknown";
       this.name="noname";
    }

    public static void speak(){
        System.out.println("meow");
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
