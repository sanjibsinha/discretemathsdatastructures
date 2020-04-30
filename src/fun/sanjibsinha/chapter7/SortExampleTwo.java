package fun.sanjibsinha.chapter7;

import java.util.Arrays;

public class SortExampleTwo {

    public static void main(String[] args) {

        int[] anyArray = {210, 45, 258, 326, -12, 0, 89, 4, 9};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(anyArray));
        System.out.println("After Sorting : ");

        for (int i = 0; i < anyArray.length; i++){
            int index = i;
            for (int j = i + 1; j < anyArray.length; j++)
                if (anyArray[j] < anyArray[index])
                    index = j;

            int smallerNumber = anyArray[index];
            anyArray[index] = anyArray[i];
            anyArray[i] = smallerNumber;
            System.out.println(anyArray[i]);
        }
    }
}
