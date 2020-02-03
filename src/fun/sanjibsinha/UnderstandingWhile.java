package fun.sanjibsinha;

import javax.swing.*;
import java.util.Scanner;

public class UnderstandingWhile {
    static int inputNumebr = 0;
    static int incrementingValue = 1;
    static int multiplyingValue = 1;
    static int finalValue = 1;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("An 'int' data type takes 32 bits of memory.");
        System.out.println("Enter a number of bits to know the upper range that it contains : ");
        inputNumebr = sc.nextInt();

        while (incrementingValue < inputNumebr){
            multiplyingValue *= 2;
            finalValue = finalValue + multiplyingValue;
            incrementingValue++;
        }
        if(inputNumebr == 0 || inputNumebr == 1){
            System.out.println("The upper range : " + inputNumebr);
        } else {
            System.out.println("The upper range : " + finalValue);
        }
    }
}
