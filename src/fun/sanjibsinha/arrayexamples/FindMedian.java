package fun.sanjibsinha.arrayexamples;

import java.util.Arrays;

public class FindMedian {

    static double median;
    // get the median
    public static double getMedian(int[] theArray, int num){
        //we know that median varies due to the odd and even numbers
        // let us sort the array first
        Arrays.sort(theArray);
        // checking whether size is even
        if (num % 2 == 0){
            median = (double) (theArray[(num / 2) - 1] + theArray[num / 2]) / 2;
            return median;
        } else{
            // else the size is odd
            median = (double) theArray[num / 2];
            return median;
        }
    }

    public static void main(String[] args) {
        int theArray[] = {3, 2, 3, 4, 2};
        int num = theArray.length + 5;
        System.out.println();
        System.out.println("Median = " + getMedian(theArray, num));
        // 2 2 3 3 4 -> 4 4 4
        // when 5 is added, the array length becomes 10
        // 2 2 3 3 4 -> 4 4 4 4 4
    }
}
