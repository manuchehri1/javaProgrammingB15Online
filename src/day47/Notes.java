package day47;

public class Notes {
    /*
    *
WHEN I MUST USE INSTANCE METHOD RATHER THAN STATIC ?
when you need to access or modify
the object's attribute (instance field)
Inheritance
IS-A Relationship :
public class Car{ }
public class ElectricCar extends Car{

}
-- THIS IS A VALID STATEMENT
ElectricCar is a Car
Dog is a Animal
Employee is a Person
SalariedEmployee is a Employee
--- THIS IS NOT VALID !!!
Car is a ElectricCar
Person is a Teacher
----  WE CAN INHERITE --
as long its visible|accessible
fields ( instance and static )
methods ( instance and static )
constructor is not inherited !!!! we call constructor bu keyword super()!!
how can we reuse the logic defined in super class constructor
we can call using super(arguments..)
method overriding :
sub class can override the content of
inherited super class instance method
to provide its own implementation
@Override is called annotation
it will ensure the method is correctly overrien once being used
and its optional to use
but highly recommended
// super class method
 private void doSomething(){
    // doing bunch of stuff
 }

 // sub class method
 private void doSomething(){
    // doing bunch of stuff
 }
ABOVE IS NOT OVERRIDING BECAUSE THEY DONT SEE EACH OTHER AT ALL
IT WILL COMPILE
// super class method
 void doSomething(){
    // doing bunch of stuff
 }

 // sub class method
 private void doSomething(){
    // doing bunch of stuff
 }
ABOVE IS NOT A VALID OVERRIDING BECAUSE ACCESS MODIFER
IN SUB CLASS SHOULD BE SAME OR MORE VISIBLE
default --->> default, protected , public
// super class method
 public void doSomething(){
    // doing bunch of stuff
 }

 // sub class method
 public void doSomething(){
    // doing bunch of stuff
 }
ABOVE IS VALID OVERRIDING
// super class method
 private void doSomething(){
    // doing bunch of stuff
 }

 // sub class method
 //@Override /-->> error!!!!!!!
 public void doSomething(){
    // doing bunch of stuff
 }
IS IT A OVERRIDING???  NO@@!!!!!!!
DOES IT COMPILE ???
Abstract class
1 , how to create one ?
    use the word abstract in class definition
2, what does it do ?
    * it will prevent object being created out of this class
        also known as - can not be instantiated
    * it can have abstract method and it does not have body
        who needs to provide body ?
        concrete sub class must provide body for the methods
        also known as implementing abstract method
3 , what is the different between
    a normal(non abstract) class and abstract class ?
    a normal(non abstract) class
        CAN NOT HAVE ABSTRACT METHOD
        it can have everything else
    an abstract class can have
        fields :
            instance field
            static field
        methods :
            abstract methods
            non-abstract instance methods
            static methods
        constructor:
            OF COURSE IT CAN !!
            BUT WHY?????????WE ARE NOT CREATING OBEJCT ???
            YES WE ARE NOT CREATING OBJECT HERE
            But we can provide reusable code for sub class
            in abstract class constructor
            most of the time , initializing the fields
            by using super(arguments...)
SO THE BOTTOM LINE IS :
ABSTRACT CLASS CAN NOT BE INSTANTIATED (NO OBJECT)
IT CAN HAVE EVERYTHING A NORMAL CLASS CAN HAVE
PLUS IT CAN HAVE ABSTRACT METHOD

    *
    * */

}
