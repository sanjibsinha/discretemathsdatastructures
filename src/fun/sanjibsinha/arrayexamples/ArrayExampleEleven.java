package fun.sanjibsinha.arrayexamples;

/*
Multidimensional array using for loop
*/

public class ArrayExampleEleven {

    public static void main(String[] args){

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++){
            System.out.print(i + " => ");
            for (int j = 0; j < 3; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}