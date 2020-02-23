package day51.my_practice;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public abstract class Animal {

    public abstract void makeNoise();//{
//        System.out.println("general animal noise");
//    }
}

 class Dog extends Animal{


    @Override
    public void makeNoise(){
        System.out.println("woof");
    }
}

class Horse extends Animal{
    @Override
    public void makeNoise(){
        System.out.println("neinei");
    }

}
class Tiger extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("hoorrr");
    }
}
