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

        System.out.println("Here goes all the elements after pushing them.");

        for (int i = 0; i < 5; i++){
            System.out.println(lists.get(i));
        }

        System.out.println("The last element of the stack: " + lists.lastElement());

        System.out.println("Now we are going to remove one element.");

        lists.pop();

        System.out.println("Here goes all the elements after popping one.");

        for (int i = 0; i < 4; i++){
            System.out.println(lists.get(i));
        }

        System.out.println("The last element is gone! The last one will always be out first.");
        System.out.println("For this reason it is called Last in First out (LIFO)");

    }
}
