package fun.sanjibsinha.arrayexamples;

public class ArrayExampleEight {

    public static void main(String[] args){

        String[] notAMeaningfulSentence = {"My ", "I ", "am ", "not ", "a ", "Robot"};
        String[] aMeaningfulSentence = new String[5];
        System.arraycopy(notAMeaningfulSentence, 1, aMeaningfulSentence, 0, 5);
        for (int i = 0; i<=4; i++){
            System.out.print(aMeaningfulSentence[i]);
        }
    }
}