package fun.sanjibsinha.arrayexamples;

/*
In this problem we will see how we can manipulate different type of
Array methods using internal and external libraries
*/

//import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A17 {

    public static void main(String[] args){

        int[] numberCollection = {1, 2};
        //we can get a particular value through index
        System.out.println(Array.get(numberCollection, 1));
        //we can get the length of the array
        System.out.println(Array.getLength(numberCollection));

        /*
        Using external libraries is required in some situations where we want to
        manipulate array values. Please consult the related texts and associated links
        written in the book
        */
        //using apache commons lang3 external library
        int[] cartOne = {1, 2, 3, 4};
        System.out.println("The length of the first cart : " + cartOne.length);
        int[] cartTwo = {5, 200, 36, 4, 78, 123};
        System.out.println("The length of the second cart : " + cartTwo.length);
        //int[] addingCart = ArrayUtils.addAll(cartOne, cartTwo);
        //System.out.println("Combining two carts the length has changed : " + addingCart.length);
        //we can also see the final output
        //System.out.println("The adding cart looks like this : " + Arrays.toString(addingCart));

    }
}

