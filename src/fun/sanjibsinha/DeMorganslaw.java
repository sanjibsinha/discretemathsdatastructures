package fun.sanjibsinha;

/*
not (a and b) is the same as (not a) or (not b)
not (a or b) is the same as (not a) and (not b)
*/

import java.util.Scanner;

public class DeMorganslaw {
    static int numOne = 0;
    static int numTwo = 0;
    static int additionOfTwoNumbers = 0;
    public static void main(String[] args) {
        System.out.println("Enter a positive number: ");
        Scanner one = new Scanner(System.in);
        numOne = one.nextInt();
        System.out.println("Enter another positive number: ");
        Scanner two = new Scanner(System.in);
        numTwo = two.nextInt();
/*
These two are same:
not (a and b) is the same as (not a) or (not b)

        if(!(numOne >= 10 && numTwo <= 15)){
            additionOfTwoNumbers = numOne + numTwo;
            System.out.println("Addition of two numbers is : " + additionOfTwoNumbers);
        } else {
            System.out.println("The number is not between 10 and 15");
        }


        if(!(numOne >= 10) || !(numTwo <= 15)){
            additionOfTwoNumbers = numOne + numTwo;
            System.out.println("Addition of two numbers is : " + additionOfTwoNumbers);
        } else {
            System.out.println("The number is not between 10 and 15");
        }

*/

/*
These two are same:
not (a or b) is the same as (not a) and (not b)

        if(!(numOne >= 10 || numTwo <= 15)){
            additionOfTwoNumbers = numOne + numTwo;
            System.out.println("Addition of two numbers is : " + additionOfTwoNumbers);
        } else {
            System.out.println("The number is neither less than equal to 10 " +
                    "nor greater than equal to 15");
        }



        if(!(numOne >= 10) && !(numTwo <= 15)){
            additionOfTwoNumbers = numOne + numTwo;
            System.out.println("Addition of two numbers is : " + additionOfTwoNumbers);
        } else {
            System.out.println("The number is neither less than equal to 10 " +
                    "nor greater than equal to 15");
        }
*/

    }
}
