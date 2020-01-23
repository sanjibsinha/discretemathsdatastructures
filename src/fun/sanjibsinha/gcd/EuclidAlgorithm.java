package fun.sanjibsinha.gcd;

import java.util.Scanner;

public class EuclidAlgorithm {

    static int numOne = 0;
    static int numTwo = 0;

    //this is Euclid's original version
    static int subtractionBased(int numOne, int numTwo){
        while (numOne != numTwo){
            if(numOne > numTwo)
                numOne = numOne - numTwo;
            else
                numTwo = numTwo - numOne;
        }
        return numOne;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner num1 = new Scanner(System.in);
        numOne = num1.nextInt();
        System.out.println("Enter another number: ");
        Scanner num2 = new Scanner(System.in);
        numTwo = num2.nextInt();
        System.out.println("You have entered " + numOne + " and " + numTwo);
        System.out.println("The GCD is: " + subtractionBased(numOne, numTwo));
    }
}
