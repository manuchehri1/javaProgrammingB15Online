package day50;

public class Circle_My extends Shape_My {

    int radius;

    public Circle_My(String name, int radius) {
        super(name);
        this.radius = radius;
    }


    @Override
    public void calculateArea() {
        this.area = Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Make a point and start making circle with radius " + radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

}
