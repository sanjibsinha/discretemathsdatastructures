package fun.sanjibsinha.arrayexamples;

import java.util.Arrays;

public class MaximizingMedian {

    static double median;

    static double getMaxMedian(int[] theArray, int lengthOfArray, int addElement){
        int size = lengthOfArray + addElement;
        // sort the array first
        Arrays.sort(theArray);

        // checking whether size is even
        if (size % 2 == 0){
            median = (double) (theArray[(size / 2) - 1] + theArray[size / 2]) / 2;
            return median;
        } else{
            // else the size is odd
            median = theArray[size / 2];
            return median;
        }
    }
    public static void main(String[] args) {
        int[] theArray = {3, 2, 3, 4, 2, 4, 41};
        int lengthOfArray = theArray.length;
        // we cannot add 5 elements when the number of the array elements is 5
        // becuase it will give us error as it goes beyond index bound
        // however we can tackle this problem by increasing the array elements
        // now we can add up to 6 elements
        int addElement = 6;
        System.out.print("We can add up to 6 elements to maximize the Median: "
                + (int)getMaxMedian(theArray, lengthOfArray, addElement));
        System.out.println();
    }
}
