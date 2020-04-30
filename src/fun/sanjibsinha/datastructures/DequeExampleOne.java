package fun.sanjibsinha.datastructures;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeExampleOne {

    public static void main(String[] args) {

        // ArrayDeque class implements Deque interface
        ArrayDeque<String> deques = new ArrayDeque<String>();
        deques.addFirst("John");
        deques.addLast("Json");

        for (String names : deques){
            System.out.println(deques);
        }

        deques.addFirst("Smith");
        deques.addLast("Web");

        for (Iterator<String> iter = deques.iterator(); iter.hasNext();  ) {
            System.out.println(iter.next());
        }

        for(int i = 4; i >= deques.size(); i--){
            System.out.println(deques);
        }

        deques.removeFirst();

        for(int i = 3; i >= deques.size(); i--){
            System.out.println(deques);
        }

        deques.removeLast();

        for(int i = 2; i >= deques.size(); i--){
            System.out.println(deques);
        }


    }
}
