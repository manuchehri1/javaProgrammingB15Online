package office_hour_01_16;

public class Notes {
    /*
    Practice Topic: Encapsulation
Access-modifiers: public, proected, default, private
private: only visible or accessible within the class
instance variable: declared within the class, outside any methods & blocks
            belong to the object
            each object they have thier own copy of isntance variable
constructor:    used for creating object
     every class MUST have. if we don't create one then the compiler will create the default(no-arg) constructor
            gets executed as sson as we create the object of the class
        decleration:
                Access-modifier  ClassName(parameter){
                        statement;
                }
creating object of the class: object must be created with existing constructor
        ClassName   ReferenceName = new  ExistingConstructor;
Encapsulation: data hiding
        1. data has private access modifer
        2. grants other classes get access to the private data through public getter/setter methods
        getter(Read Only):  instance method
                    returns the value of the private data
                    return type of the method MUST match with the private data' data-type
        setter(Modify): instance method
                    does not return anything
                    return-type MUST be void
                passes a parameter. Parameter's data-type MUST match with the preivate data' data-type
this: refers to object instance
    this. : used to call instance variable and instance methods
            if the local variable has same variable name with instance variable, then we can use this keyword to call instance

    */
}
