package fun.sanjibsinha.controlconstructs;

import java.util.Scanner;

public class UnderstandingForWhile {

    public static void getWhile(){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int nb = 0;
        while(nb < num.length) {
            num[nb] = scanner.nextInt();
            if(num[nb] < 0)
                break;
            if(num[nb] >= 1000)
                continue;
            ++nb;
            System.out.println(num[nb]);
        }
        System.out.println();
    }

    public static void getFor(){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];
        int nb = 0;
        for(int i = 0; i < num.length; ++i) {
            num[i] = scanner.nextInt();
            if(num[i] < 0)
                break;
            ++nb;
            System.out.println(num[i]);
        }

    }

    public static void main(String[] args) {
        getWhile();

    }
}
