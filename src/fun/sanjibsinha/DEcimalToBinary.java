package fun.sanjibsinha;

import java.util.Scanner;

public class DEcimalToBinary {
    static int inputNo = 0;
    static int remainderNo = 0;
    static int quotientNo = 0;
    static int incrementNo = 0;

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        inputNo = sc.nextInt();

        while (incrementNo <= inputNo){
            remainderNo = inputNo % 2;
            quotientNo = inputNo / 2;
            incrementNo++;
            quotientNo = quotientNo / 2;
            remainderNo = quotientNo % 2;
        }
        System.out.print(quotientNo + " ");
        System.out.print(remainderNo + " ");

    }
}
