package fun.sanjibsinha.datastructures;

import java.util.*;

public class QueueEXampleTwo {

    public static void main(String[] args) {

        //we can convert an array to queue and add more functionality
        String[] arrayNames = {"John", "Json", "Sanjib"};
        Queue<String> queueNames = new LinkedList<>();
        //we are converting array to queue
        Collections.addAll(queueNames, arrayNames);
        System.out.println(queueNames);
        //now we can implement all queue functionality
        queueNames.remove("Sanjib");
        System.out.println(queueNames);

    }
}
