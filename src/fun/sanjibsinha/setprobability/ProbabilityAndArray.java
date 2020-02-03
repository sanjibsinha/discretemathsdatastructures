package fun.sanjibsinha.setprobability;

import java.util.Arrays;
public class ProbabilityAndArray {

    static float totalNumberOfTheElement;
    static float theProbability;

    static float findTheProbableElementInArray(int[] theArray, int theLengthOfArray, int theElement){

        for(int i = 0; i < theLengthOfArray; i ++){
            if(theArray[i] == theElement){
                totalNumberOfTheElement++;
            }
        }
        theProbability = totalNumberOfTheElement / theLengthOfArray;
        return theProbability;

    }

    public static void main(String[] args) {
        int[] theArray = {255, 2523, 25, 725, 7825, 245};
        int theElement = 25;
        int lengthOfArray = theArray.length;
        theProbability = findTheProbableElementInArray(theArray, lengthOfArray, theElement);
        System.out.println(theProbability);
    }

}
