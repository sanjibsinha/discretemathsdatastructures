package fun.sanjibsinha.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExampleThree {

    public static void main(String[] args) {

        Queue<String> letters = new LinkedList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("F");
        System.out.println(letters);
        //another method of removing
        letters.poll();
        System.out.println(letters);
        //another method of adding
        letters.offer("G");
        System.out.println(letters);

    }
}
