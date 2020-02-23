package W3resource_com;

public class Practice_3 {
    public static void main(String[] args) {
//        16. Write a program in Java to display the pattern like right angle triangle
//        with a number. Go to the editor
//
//        Test Data
//        Input number of rows : 10
//        Expected Output :
//
//        1
//        12
//        123
//        1234
//        12345

//        for (int i = 1 ; i< 6;i++){
//            for (int j = 1; j<=i; i++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//
//        17. Write a program in Java to make such a pattern like right angle
//        triangle with a number which will repeat a number in a row.The pattern is as follows : Go to the editor
//
//        1
//        22
//        333
//        4444
        for (int i = 1 ; i<= 10;i++){
            for (int j = 1; j<=10; i++){
                System.out.print(i*j); //2
            }
            System.out.println();
        }



    }
}
