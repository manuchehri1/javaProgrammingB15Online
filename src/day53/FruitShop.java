package day53;

public class FruitShop {

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet","red","Fuji");

        Fruit f1 = (Fruit) a1;
        Fruit f2 = new Apple("crispy but tasteless", "hot red","Gala");

        Fruit f3 = new Orange("sour", "orange",12);

        Fruit f4 = new Orange("very sweet", "blood red", 10);






    }
}
