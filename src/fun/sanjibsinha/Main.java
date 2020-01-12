package fun.sanjibsinha;
/*
Symmetric difference of two sorted arrays
 */

public class Main {

    static void findSymmetricDifference(int[] first, int[] second,
                                        int lengthOfFirst, int lengthOfSecond){

        int i = 0, j = 0;
        while (i < lengthOfFirst && j < lengthOfSecond){
            if (first[i] < second[j]){
                System.out.print(first[i]+ " ");
                i++;
            } else if (second[j] < first[i]){
                System.out.print(second[j] + " ");
                j++;
            } else{
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        int[] firstArray = {2, 3, 6, 7, 9, 10, 12, 15};
        int[] secondArray = {5, 9, 10, 13, 14, 15};
        //SymmetricDifference sim1 = new SymmetricDifference();
        //sim1.findSymmetricDifference(firstArray, secondArray, firstArray.length, secondArray.length);
        findSymmetricDifference(firstArray, secondArray, firstArray.length, secondArray.length);
    }
}
