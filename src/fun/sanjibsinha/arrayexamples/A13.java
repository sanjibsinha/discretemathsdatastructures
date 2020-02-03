package fun.sanjibsinha.arrayexamples;

/*
There are few basic rules we should remember about an array
*/

public class A13 {

    public static void main(String[] args){
        //array declaration
        int[] myNumber = new int[5];
        //now we need to add elements
        myNumber[0] = 50;
        myNumber[1] = 60;
        myNumber[2] = 70;
        //etc
        int[] anotherNumber = {1, 2, 3};
        //printing the value of an array like this
        //gives us reference value : [I@5ba23b66
        System.out.println(myNumber);
        //we can print out the individual value of element by index
        System.out.println(myNumber[0] + " => " + anotherNumber[0]);
        //we can also use for loop
        for (int i = 0; i <= 2; i++){
            System.out.println(myNumber[i]);
        }
    }
}
