package fun.sanjibsinha.arrayexamples;
/*
We can perform some of the most common manipulations related to arrays
*/

public class ArrayExampleNine {

    public static void main(String[] args){

        String[] notAMeaningfulSentence = {"My ", "I ", "am ", "not ", "a ", "Robot"};
        String[] aMeaningfulSentence = java.util.Arrays.copyOfRange(notAMeaningfulSentence, 1, 6);
        for (int i = 0; i <= (aMeaningfulSentence.length - 1); i++){
            System.out.print(aMeaningfulSentence[i]);
        }
    }
}