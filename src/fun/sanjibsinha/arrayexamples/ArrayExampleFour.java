package fun.sanjibsinha.arrayexamples;
/*
The shortcut syntax to create and initialize an array
*/

public class ArrayExampleFour {

    public static void main(String[] args){

        String[] nameCollection = {
                "John Smith", "Chicago", "good gunner."
        };
        System.out.println("He is " + nameCollection[0] + ", from " + nameCollection[1]
                + ". And he is a " + nameCollection[2]);
    }
}