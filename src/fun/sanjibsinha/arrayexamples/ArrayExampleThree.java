package fun.sanjibsinha.arrayexamples;
/*
The proper initialization of an array
*/

public class ArrayExampleThree {

    public static void main(String[] args){
        //we can also create and initialize an array like this
        int schoolSections[] = new int[4];
        schoolSections[0] = 1;
        schoolSections[1] = 2;
        schoolSections[2] = 3;
        schoolSections[3] = 4;
        System.out.println("We want section 1 : " + schoolSections[0]);
        /*
        However this above type of initialization is highly discouraged
        */
        int[] schoolSection = new int[4]; // it is OK

    }
}