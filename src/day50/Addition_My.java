package day50;
//Create sub class Addition
//		it has one constructor to set
//                num1 and num2
//                it should also set questionType to "addition"
//        operator to  "+"
//        it should implement calculate method
//        toString method in below format
//        return num1 + operator +  num2  =  "" if not calculated yet
//        return num1 + operator +  num2  =  answer if already calculated

public class Addition_My extends Question_ {

    public Addition_My(int num1, int num2){
        super(" addition question ", "+");
        this.num1=num1;
        this.num2=num2;
    }




    @Override
    void calculate() {
        answer=num1+num2;

        calculated=true;
    }

    public String toString(){
        if (calculated==true){

            return num1+operator+num2+" = "+answer;
        }else {
            return num1+operator+num2+" = ";
        }

    }
}
