package fun.sanjibsinha.arrayexamples;
/*
We can remove any element of an array using apache commons lang library
*/

//import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class A19 {

    public static void main(String[] args){
        //declaring an array
        int[] myNumber = {1, 58, 23, 45, 47, 13, 35};
        //the length of the array and the output
        System.out.println("The length of the array : " + myNumber.length);
        System.out.println("The array before removing any element : " + Arrays.toString(myNumber));
        //removing an element in the array
        //int[] newArrayOfMyNumber = ArrayUtils.remove(myNumber, 2);
        //System.out.println("The length of the new array after removel of index 2 : " + newArrayOfMyNumber.length);
        //System.out.println("The array after removing element 3, index 2 : "
          //      + Arrays.toString(newArrayOfMyNumber));
        System.out.println("The index 2 and element 3, that is number " + myNumber[2] + " is missing in the new array.");
    }
}
