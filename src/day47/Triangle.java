package day47;

public class Triangle extends Shape {


//    String name;
//    int area;
    int height;
    int width;


    public Triangle(String name, int height, int width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    public  void calculateArea() {
        System.out.println(area=height*width/2);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }


    
    

}
