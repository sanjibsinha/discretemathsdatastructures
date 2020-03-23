package fun.sanjibsinha.datastructures;

public class ArrayExamples {

    /**
     * each box will contain two boxes
     */
    static String[] singleBox = {"First Box", "Second Box", "Third Box"};
    /**
     * first box will have white and black box
     */
    static String[][] doubleBox = {
            {"White", "Black", "Empty"},
            {"Red", "Blue", "Empty"},
            {"Yellow", "Green", "Empty"}
    };
    /**
     * white box will have three boxes apple, cabbage and mutton
     */
    static String[][][] tripleBox = {
            {
                    {"Apple", "Banana", "Guava"}, {"Cabbage", "Potato", "Brinjal"}, {"Mutton", "Lamb", "Chicken"}
            },
            {
                    {"Mutton", "Lamb", "Chicken"}, {"Apple", "Banana", "Guava"}, {"Cabbage", "Potato", "Brinjal"}
            },
            {
                    {"Cabbage", "Potato", "Brinjal"}, {"Apple", "Banana", "Guava"}, {"Mutton", "Lamb", "Chicken"}
            }
    };


    /**
     * this is main statement
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < singleBox.length; i++){
            System.out.println(singleBox[i]);
            for (int j = 0; j < doubleBox.length; j++){
                System.out.println(" * " + doubleBox[j][i] + " * ");
                /**
                 * enhanced for loop
                 */
                for (String[][] box : tripleBox) {
                    System.out.println(" ** " + box[j][0] + " ** ");
                }
            }
        }
    }
}