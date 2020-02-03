package fun.sanjibsinha.arrayexamples;

/*
How array works : index=>element
*/

public class ArrayExampleTen {
    public static void main (String[] args)
    {
        //declaring a certain type of array, we choose data type int
        int[] ageCollection;

        //the next step deals with allocating memory for elements, we choose 5
        ageCollection = new int[5];

        //the initialization process begins with the first element
        for (int i = 0; i <= 4; i ++){
            int j = 18;
            j = j + i;
            ageCollection[i] = j;
            System.out.println("Element at index " + i + " => " + ageCollection[i]);
        }
    }
}