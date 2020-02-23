package day50;

public abstract class Shape implements Drawable {

    String name;
    double area;

    // why abstract class have constructor even we can not use it to create an object ?
    // it exists purely to let sub class to call and reuse the functionality in sub class constructor

    public Shape(String name) {
        this.name = name;
    }

    public abstract void calculateArea();
//    public abstract void draw();

}
