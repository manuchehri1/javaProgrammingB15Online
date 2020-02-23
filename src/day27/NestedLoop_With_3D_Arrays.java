package day27;

public class NestedLoop_With_3D_Arrays {
    public static void main(String[] args) {
        int[][][]  arr3D = {   { {1,2,3}, {4,5,6} }  ,   { {7,8,9} , {10,11,12} }      };


        for (int i = 0; i <arr3D.length ; i++) {
            for (int j = 0; j <arr3D[i].length ; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {

                    System.out.print(arr3D[i][j][k]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("=========================");










        int max=arr3D[0][0][0];

        for (int i = 0; i <arr3D.length ; i++) {
            for (int j = 0; j <arr3D[i].length ; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    if (arr3D[i][j][k]>max){
                        max=arr3D[i][j][k];
                    }
                }
            }
        }
        System.out.println(max);
        System.out.println("=====================================");

        for (int i = 0; i < arr3D.length; i++) { // each index of 2D array
            for (int j = 0; j < arr3D[i].length; j++) { // each index number of 1D array
                for (int k = 0; k < arr3D[i][j].length; k++) { // each index number of the values
                    System.out.print(arr3D[i][j][k] + " "); // returns values

                }
            }

        }
// Assignment: convert the nested loops above to the nested for each loop

    }
}
