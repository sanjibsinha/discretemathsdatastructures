package fun.sanjibsinha.datastructures;

import java.util.Stack;

public class StackExamples {

    public static void main(String[] args) {

        Stack<Integer> lists = new Stack<>();
        lists.push(10);
        lists.push(11);
        lists.push(12);
        lists.push(13);
        lists.push(14);

        System.out.println(lists.lastElement());

        System.out.println();

        for (int i = 0; i < 5; i++){
            System.out.println(lists.get(i));
        }

        System.out.println();

        lists.pop();
        lists.push(15);

        for (int i = 0; i < 5; i++){
            System.out.println(lists.get(i));
        }

    }
}
