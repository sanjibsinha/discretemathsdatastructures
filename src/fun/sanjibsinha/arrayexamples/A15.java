package fun.sanjibsinha.arrayexamples;

/*
We can pass array as parameter and we can manipulate that feature in many ways
In this problem we have solved how to add a collection of numbers
*/

import java.util.*;

import java.util.Arrays;

public class A15 {

    public static void main(String[] args){

        int[] anotherNumber = {10, 25, 300};
        addingAColectionOfNUmbers(anotherNumber);
    }
    public static void addingAColectionOfNUmbers(int[] aCollectionOfNumbers){
        int sum = 0;
        for (int i = 0; i < aCollectionOfNumbers.length; i++){
            sum += aCollectionOfNumbers[i];
        }
        System.out.println(sum);
    }
}
