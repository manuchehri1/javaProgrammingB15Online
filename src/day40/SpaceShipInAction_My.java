package day40;

public class SpaceShipInAction_My {
    public static void main(String[] args) {

        SpaceShip_My ship1= new SpaceShip_My();

        ship1.name = "Apollo";
        ship1.currentDirection="right";
        ship1.xCordinate=0;
        ship1.yCordinate=0;

        ship1.setInitialPosition(2,2);

        ship1.move1Block();
        ship1.currentDirection="up";

        ship1.move1Block();

        System.out.println(ship1);











    }




}
