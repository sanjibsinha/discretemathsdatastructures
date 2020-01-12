package fun.sanjibsinha;

public class SymmetricDifference {

    public void findSymmetricDifference(int[] first, int[] second,
                                        int lengthOfFirst, int lengthOfSecond){

        int i = 0;
        int j = 0;
        while (i < lengthOfFirst && j < lengthOfSecond){
            if(first[i] < second[j]){
                System.out.println(first[i] + " ");
                i++;
            } else if(second[j] < first[i]){
                System.out.println(second[j] + " ");
                j++;
            } else {
                i++;
                j++;
            }
        }
    }
}
