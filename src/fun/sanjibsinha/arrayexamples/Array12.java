package fun.sanjibsinha.arrayexamples;

import java.util.Arrays;

/*
Testing a few built-in array methods
*/
public class Array12 {

    public static void main(String[] args){
        //array declaration
        int[] myNumber = new int[5];
        //now we need to add elements
        myNumber[0] = 50;
        myNumber[1] = 60;
        myNumber[2] = 70;
        //etc
        int[] anotherNumber = {1, 2, 3};
        //we can print any array value this way
        System.out.println(Arrays.toString(myNumber));
        System.out.println(Arrays.toString(anotherNumber));
    }
}