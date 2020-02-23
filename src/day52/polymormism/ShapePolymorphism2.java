package day52.polymormism;

public class ShapePolymorphism2 {

    public static void main(String[] args) {

        Shape c1 = new Circle("poppy", 5);
        drawShape3Time(c1);

    }

    public static void drawShape3Time (Shape anyShape){
        anyShape.draw();
        anyShape.draw();
        anyShape.draw();
    }



}
