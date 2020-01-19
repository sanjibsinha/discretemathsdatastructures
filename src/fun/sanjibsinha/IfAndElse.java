package fun.sanjibsinha;

import java.util.Scanner;

public class IfAndElse {

    static int age = 0;

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner yourAge = new Scanner(System.in);
        age = yourAge.nextInt();

        if (age >= 1 && age <= 18){
            System.out.println("Happy birthday!");
        } else if(age == 21 || age == 50){
            System.out.println("Important birthday!");
        } else if(age >= 60){
            System.out.println("Don't retire. Keep working!");
        } else {
            System.out.println("Keep living and help others!");
        }
    }
}
