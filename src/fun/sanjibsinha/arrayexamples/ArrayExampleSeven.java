package fun.sanjibsinha.arrayexamples;
/*
System class has a method called 'arraycopy()' that has five parameters
arraycopy(Object source, int source-position, Object destination, int destination position, int length)
*/

import java.util.Arrays;

public class ArrayExampleSeven {

    public static void main(String[] args){

        String[] notAMeaningfulSentence = {"My ", "I ", "am ", "not ", "a ", "Robot"};
        String[] aMeaningfulSentence = new String[5];
        System.arraycopy(notAMeaningfulSentence, 1, aMeaningfulSentence, 0, 5);
        System.out.println(aMeaningfulSentence[0]
                + aMeaningfulSentence[1] + aMeaningfulSentence[2] + aMeaningfulSentence[3]
                + aMeaningfulSentence[4]);
    }
}