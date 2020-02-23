package day40;

public class SpaceShip_My {

    String name;
    int xCordinate;
    int yCordinate;
    String currentDirection;

    public void setInitialPosition(int x, int y){

        xCordinate=x;
        yCordinate=y;
    }


    public void setDirection(String newDirection ){
         currentDirection=newDirection;
    }


    public void move1Block(){

        if (currentDirection.equalsIgnoreCase("up")){
            yCordinate++;
        }else if (currentDirection.equalsIgnoreCase("down")){
            yCordinate--;
        }else if (currentDirection.equalsIgnoreCase("right")){
            xCordinate++;
        }else if (currentDirection.equalsIgnoreCase("left")){
            xCordinate--;
        }
    }
//    public   String toString( ){
//        String result="The spaceship "+name+" is moving to "+currentDirection+" and its coordinate "+xCordinate+", "+yCordinate;
//        return result;
//    }



    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", xCordinate=" + xCordinate +
                ", yCordinate=" + yCordinate +
                ", currentDirection='" + currentDirection + '\'' +
                '}';
    }
}
