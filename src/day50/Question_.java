package day50;
//We will create 2nd grade math Question program
//        Question is abstract idea
//        and we will represent it by Abstract class here
//	it has below fields :
//        int num1
//        int num2
//        String operator
//        int answer
//        boolean calculated
//        String questionType = "Unknown"
//abstract void method calculate();
//        Constructor to set
//        Question type and Operator
//        toString method to return this question is + questionType


public abstract class Question_ {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType="Unknown";


    abstract void calculate();

//    public Question() {
//    }

    public Question_(String questionType, String operator) {
        this.questionType = questionType;
        this.operator = operator;

    }

}
