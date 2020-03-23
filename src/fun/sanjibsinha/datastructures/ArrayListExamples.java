package fun.sanjibsinha.datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExamples {

    public static void main(String[] args) {

        /**
         * ArrayList examples
         * ArrayList is an ADT that provides a generic class, which has many useful methods to deal
         * with a collection of data. It also supports different data types.
         * An ArrayList is declared as follows:
         * ArrayList<T> arrayList = new ArrayList<T>();
         * Here T is the data type.
         */
        ArrayList<String> arrayList = new ArrayList<String>();
        //we have added 5 items
        arrayList.add("index");
        arrayList.add("about");
        arrayList.add("contact");
        arrayList.add("products");
        arrayList.add("sellers");
        //we have removed 2 items
        arrayList.remove("products");
        arrayList.remove("sellers");

        //we will change the first index page to home
        arrayList.set(0, "home");

        System.out.println("Unsorted list: ");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("Now we are going to sort the list: ");
        Collections.sort(arrayList);

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println();

        /**
         * we should use the Wrapper class instead of primitive data type
         */
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(456.45);
        doubleList.add(12.123);
        doubleList.add(78945.0258);
        System.out.println("Unsorted list: ");
        for (int i = 0; i < doubleList.size(); i++){
            System.out.println(doubleList.get(i));
        }
        System.out.println("Now we are going to sort the list: ");
        Collections.sort(doubleList);
        for (int i = 0; i < doubleList.size(); i++){
            System.out.println(doubleList.get(i));
        }
    }
}
