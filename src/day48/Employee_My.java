package day48;
/*
Warm up
----------
abstract super class called Employee
instance fields : name , id
Constructor : to set all the fields
abstract methods :
		calculateAnualSalary
		toString
HourlyEmployee
instance fields :
	hourlyWage , numsOfHours ,
Constructor : to set all the fields
instance methods ;
	calculateAnualSalary
	toString
----------------
FullTimeEmployee
	instance fields :
		 monthlySalary
Constructor : to set all the fields
instance methods ;
	calculateAnualSalary
	toString
* */

public  abstract class Employee_My {

    String name;
    int id;
    public Employee_My(){

    }

    public Employee_My(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract int calculatingAnnualSalary();

    public abstract String toString();




}
