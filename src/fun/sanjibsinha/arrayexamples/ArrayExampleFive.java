package fun.sanjibsinha.arrayexamples;
/*
In multidimensional array components are themselves arrays
The rows can vary in length
*/
public class ArrayExampleFive {

    public static void main(String[] args){
        //you may imagine it as columns and rows
        String[][] nameCollections = {
                {"Name", "Location", "Occupation"}, //[0][0] => Name
                {"John Smith", "Chicago", "Gunner"}, //[1][0] => John ...
                {"Ernest Hemingway", "Writer"}, //[2][0] => Ernest...
                {"Don Juan", "Paris", "Artist"} //[3][0] => Don...
        };
        //the first column name represents the first index as [0][0], and moves on

        System.out.println(nameCollections[0][0] + " : " + nameCollections[1][0]);
        System.out.println(nameCollections[0][1] + " : " + nameCollections[1][1]);
        System.out.println(nameCollections[0][2] + " : " + nameCollections[1][2]);
        System.out.println("+++++++++++++++");
        System.out.println(nameCollections[0][0] + " : " + nameCollections[2][0]);
        System.out.println(nameCollections[0][2] + " : " + nameCollections[2][1]);
        System.out.println("+++++++++++++++");
        System.out.println(nameCollections[0][0] + " : " + nameCollections[3][0]);
        System.out.println(nameCollections[0][2] + " : " + nameCollections[3][1]);
        System.out.println(nameCollections[0][2] + " : " + nameCollections[3][2]);
    }
}
