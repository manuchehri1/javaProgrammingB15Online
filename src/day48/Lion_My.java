package day48;

import day46.Animal;

public class Lion_My extends Mammals_My {

    //   public abstract void makeNoise();
    // public abstract void drinkMilk();
    @Override
    public void drinkMilk() {
        System.out.println("Lions drink milk");
    }

    @Override
    public void makeNoise() {
        System.out.println("lion say roarrrr");
    }




    public static void main(String[] args) {

        Lion_My l1 = new Lion_My();

        Mammals_My l2 = new Lion_My();

        Animal_My l3 = new Lion_My();

        l3.makeNoise();
        l2.drinkMilk();

    }

}
