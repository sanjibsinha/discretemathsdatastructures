package fun.sanjibsinha.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleOne {

    public static void main(String[] args) {

        Queue<String> letters = new LinkedList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        System.out.println(letters);
        letters.remove();
        System.out.println(letters);
        if(letters.contains("A")){
            System.out.println("The queue contain A.");
        } else {
            System.out.println("The queue does not contain A.");
        }
    }
}
