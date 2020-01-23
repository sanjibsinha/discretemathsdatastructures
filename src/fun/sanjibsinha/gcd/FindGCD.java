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

    static int euclidAlgorithm (int A, int B){
        A = Math.abs(A);
        B = Math.abs(B);
        while (B != 0){
            if (A > B){
                A = A - B;
            } else {
                B = B - A;
            }
        }
        return A;
    }

    static int gcd(int A, int B) {
        if (B == 0)
            return A;
        else if (A > B)
            return gcd(A-B,B);
        else
            return gcd(A,B-A);
    }

    public static void main(String[] args) throws ArithmeticException {

        System.out.println(recursiveBased(1071, 462));
        //output 21
        System.out.println(euclidAlgorithm(1071, 462));
        System.out.println(gcd(1071, 462));
        System.out.println(subtractionBased(1071, 462));

    }
}
