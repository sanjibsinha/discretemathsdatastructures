package fun.sanjibsinha.lcm;

public class FinndLCM {
//we can use any GCD method to find the LCM of any two numbers
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

    static int findLCMUsingGCD(int num1, int num2){
        int temp = 0;
        temp = num1 * num2 / recursiveBased(num1, num2);
        return temp;
    }

    public static void main(String[] args) {

        System.out.println(findLCMUsingGCD(21, 6));
        //output : 42

    }
}
