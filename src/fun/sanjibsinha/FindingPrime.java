package fun.sanjibsinha;
import java.util.*;
import java.math.*;
public class FindingPrime {

    private static Scanner sc;
    static int input = 0;

    static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        for (int i = 5; i * i <= num; i = i + 6)
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number to test whether it is prime or not? ");
        sc = new Scanner(System.in);
        input = sc.nextInt();
        if(isPrime(input)){
            System.out.println(input + " is prime.");
        } else {
            System.out.println(input + " is not prime.");
        }
    }
}
