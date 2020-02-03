package fun.sanjibsinha.arrayexamples;

/*
we can return any array value using a method
*/

public class A16 {

    public static void main(String args[]){
        int newArray[] = returningArrayMethod();

        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }

    public static int[] returningArrayMethod(){
        //returning any array from a method
        return new int[] {111,222,3333, 456897};
    }
}
