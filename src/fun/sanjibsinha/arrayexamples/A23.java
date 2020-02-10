package fun.sanjibsinha.arrayexamples;

import java.util.Arrays;

public class A23 {

    static double mean;
    static double median;

    // get the mean
    public static double getMean(int[] theArray, int num)
    {
        int sum = 0;
        for (int i = 0; i < num; i++)
            sum += theArray[i];

        mean = (double)sum / (double)num;
        return mean;
    }

    // get the median
    public static double getMedian(int[] theArray, int num)
    {
        //we know that median varies due to the odd and even numbers
        // let us sort the array first
        Arrays.sort(theArray);
        if (num % 2 != 0){
            median = (double)theArray[(num / 2)];
            return median;
        } else {
            median = (double)(theArray[(num - 1) / 2] + theArray[num / 2]) / 2.0;
            return median;
        }
    }

    public static void main(String[] args) {
        int theArray[] = { 1, 3, 4, 2, 5, 4, 3, 5, 155, 265};
        int num = theArray.length;
        System.out.println("Mean or National Per Capita Income = " + getMean(theArray, num));
        System.out.println("Median = " + getMedian(theArray, num));
        // the mean or national per capita income is skewed and shows us a wrong impression
        // about a nation's per capita income, or average citizen's income
        // here median is more accurate, as 80% of people earn less than or equal to 5 dollar
        // where the result shows 44.7 dollar
    }
}
