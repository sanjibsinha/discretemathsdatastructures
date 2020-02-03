package fun.sanjibsinha.arrayexamples;
/*
The built-in length property helps us to determine the size of any array
*/
public class ArrayExampleSix {

    public static void main(String[] args){

        String[][] nameCollections = {
                {"Name", "Location", "Occupation"}, //[0][0] => Name
                {"John Smith", "Chicago", "Gunner"}, //[1][0] => John ...
                {"Ernest Hemingway", "Writer"}, //[2][0] => Ernest...
                {"Don Juan", "Paris", "Artist"} //[3][0] => Don...
        };
        System.out.println("The length of the first array is : " + nameCollections.length);
        System.out.println("The length of the index 2 of the first array is : " + nameCollections[2].length);
    }
}