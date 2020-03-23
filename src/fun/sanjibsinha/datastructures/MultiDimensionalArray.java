package fun.sanjibsinha.datastructures;

public class MultiDimensionalArray {

    static String[][][] anApartment = {
            {{"3-1"}, {"3-2"}, {"3-3"}},
            {{"2-1"}, {"2-2"}, {"2-3"}},
            {{"1-1"}, {"1-2"}, {"1-3"}},
            {{"G-1"}, {"G-2"}, {"G-3"}}
    };

    public static void main(String[] args) {
        int i, j, k;

        for (i = 0; i < 4; i++){
            for (j = 0; j < 3; j++){
                for (k = 0; k < 1; k++){
                    System.out.print(anApartment[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
