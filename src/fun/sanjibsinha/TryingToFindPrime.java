package fun.sanjibsinha;

import java.util.*;
import java.math.*;
public class TryingToFindPrime {

    private static Scanner sc;

    public static void main(String[] args) {

        int numOne, integerOne;
        sc = new Scanner(System.in);

        System.out.println("Please Enter any number to Find Factors: ");
        numOne = sc.nextInt();

        int controOne = 0;
        for (integerOne = 1; integerOne <= Math.sqrt(numOne); integerOne++)
        {
            if (numOne % integerOne == 0) {
                if (numOne / integerOne == integerOne){
                    controOne++;
                } else {
                    controOne = controOne + 2;
                }
            }
        }
        if(controOne == 2){
            System.out.println(numOne + " is prime.");
        } else {
            System.out.println(numOne + " is not prime.");
        }
    }
}
