package fun.sanjibsinha.gcd;

public class FindGCD {

    static int numOne = 0;
    static int numTwo = 0;
    static int remain = 0;

    static int divisionBased(int num1, int num2){
        int temp;
        while (num2 != 0){
            temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    //this is Euclid's original version
    static int subtractionBased(int num1, int num2){
        int temp;
        while (num1 != num2){
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }

    static int recursiveBased(int num1, int num2){
        if(num2 == 0){
            return num1;
        } else {
            int temp;
            temp = num1 % num2;
            return recursiveBased(num2, temp);
        }
    }

    public static void main(String[] args) throws ArithmeticException {

        System.out.println(recursiveBased(1071, 462));

    }
}
