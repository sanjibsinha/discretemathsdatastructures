package fun.sanjibsinha.arrayexamples;

import java.util.Arrays;

/*
We can check if any array has a certain value
*/
public class A14 {

    public static void main(String[] args){
        //array declaration
        int[] myNumber = new int[3];
        //now we need to add elements
        myNumber[0] = 50;
        myNumber[1] = 60;
        myNumber[2] = 70;
        //etc
        int[] anotherNumber = {1, 2, 3};
        String[] nameColection = {"John", "Bob", "Mary"};

        System.out.println("Does array nameCollection contains this element? "
                + Arrays.asList(nameColection).contains(2));
        System.out.println("Does array nameCollection contains this element? "
                + Arrays.asList(nameColection).contains("John"));

    }
}
