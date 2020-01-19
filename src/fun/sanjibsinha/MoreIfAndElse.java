package fun.sanjibsinha;

import java.util.Scanner;

public class MoreIfAndElse {

    static boolean isCold = false;
    static boolean isRaining = false;
    static boolean isTakingCar = false;

    public static void main(String[] args) {

        System.out.println("When asked, enter only true or false.");
        System.out.println("Is it cold outside?");
        Scanner cold = new Scanner(System.in);
        isCold = cold.nextBoolean();
        System.out.println("Is it raining?");
        Scanner raining = new Scanner(System.in);
        isRaining = raining.nextBoolean();
        System.out.println("Are you taking car?");
        Scanner takingCar = new Scanner(System.in);
        isTakingCar = takingCar.nextBoolean();

        if((isCold == true && isRaining == true) || isTakingCar == false){
            System.out.println("I wear Windcheater jacket with hood.");
        } else if((isCold == true && isRaining == false) || isTakingCar == true){
            System.out.println("I wear Windcheater jacket without hood.");
        } else {
            System.out.println("I won't wear Windcheater of any kind!");
        }
    }
}
