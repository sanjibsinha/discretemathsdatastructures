package fun.sanjibsinha.datastructures;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeExampleTwo {

    public static void main(String[] args) {

        // ArrayDeque class implements Deque interface
        ArrayDeque<String> deques = new ArrayDeque<String>();
        deques.addFirst("John");
        deques.addLast("Json");
        deques.addFirst("Smith");
        deques.addLast("Web");


        for (Iterator<String> iter = deques.iterator(); iter.hasNext();  ) {
            System.out.println(iter.next());
        }

        System.out.println("After adding two more elements at the end.");

        deques.add("Sanjib");
        deques.add("Sinha");

        for (Iterator<String> iter = deques.iterator(); iter.hasNext();  ) {
            System.out.println(iter.next());
        }
    }
}
