package fun.sanjibsinha.datastructures;

import java.util.concurrent.*;

public class QueueExampleFour {

    public static void main(String[] args) {

        BlockingQueue<String> names = new ArrayBlockingQueue<>(2);
        names.add("John");
        System.out.println(names);
        names.add("Json");
        System.out.println(names);
        names.add("Sanjib");
        System.out.println(names);
    }
}
