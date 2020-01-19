package fun.sanjibsinha;

import java.util.Scanner;

public class AnotherIfAndElse {

    static int age = 0;
    static boolean isAllowed = false;

    public static void main(String[] args) {

        System.out.println("When asked, enter only true or false.");
        System.out.println("Enter your age");
        Scanner yourAge = new Scanner(System.in);
        age = yourAge.nextInt();
        System.out.println("Is allowed? Answer either true or false!");
        Scanner allowed = new Scanner(System.in);
        isAllowed = allowed.nextBoolean();

        if(age <= 10 || age >= 70){
            if(isAllowed == true){
                System.out.println("You can go free!");
            } else {
                System.out.println("You can go free!");
            }
        } else {
            System.out.println("Your entrance fee is 10 Euro.");
        }
    }
}
