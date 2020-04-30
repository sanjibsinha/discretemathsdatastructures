package fun.sanjibsinha.datastructures;

/**
 * In this example we are going to create our own
 * Stack class to simulate the Java's in-built methods
 */

public class StackExampleOne {
    //we cannot add more than 3 elements
        final int MAX = 3;
        int overTheTop;
        //creating an array object with the
        //maximum size of Stack
        int[] max = new int[MAX];

        StackExampleOne(){
            overTheTop = -1;
        }

        boolean pushTheStack(int num){
            if(overTheTop >= (MAX - 1)){
                System.out.println("The Stack has overflowed.");
                return false;
            } else {
                max[++overTheTop] = num;
                System.out.println(num + " pushed into the Stack.");
                return true;
            }
        }

        int popTheStack(){
            if(overTheTop < 0){
                System.out.println("The Stack is underflowed.");
                return 0;
            } else {
                int x = max[overTheTop--];
                return x;
            }
        }

        int peekTheStack(){
            if(overTheTop < 0){
                System.out.println("The Stack is under-flowed.");
                return 0;
            } else {
                int x = max[overTheTop];
                return x;
            }
        }

    public static void main(String[] args) {

        StackExampleOne stacks = new StackExampleOne();
        stacks.pushTheStack(10);
        stacks.pushTheStack(100);
        stacks.pushTheStack(500);
        System.out.println("Now we are going to use the pop method.");
        System.out.println(stacks.popTheStack() + " popped from the StackClass.");
        System.out.println(stacks.popTheStack() + " popped from the StackClass.");
        System.out.println(stacks.popTheStack() + " popped from the StackClass.");
        stacks.pushTheStack(10);
        stacks.pushTheStack(100);
        stacks.pushTheStack(500);
        System.out.println("Now we are going to cross the limit. The Stack" +
                " is bound to be overflowed.");
        stacks.pushTheStack(1000);
        System.out.println(stacks.peekTheStack() + " is the last element." +
                " The last element 1000 has not been added.");

    }
}
