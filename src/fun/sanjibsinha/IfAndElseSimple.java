package fun.sanjibsinha;

public class IfAndElseSimple {
    static boolean isTrue = true;
    static boolean isFalse;

    public static void main(String[] args) {

        if(isTrue){
            System.out.println("It's true.");
            //isTrue = false;
            if(((isTrue && isTrue) || isFalse) && isFalse){
                System.out.println("It's not true any more true.");
            } else if(((isTrue && isTrue) || isFalse) || isFalse){
                System.out.println("It's very much true because the above value is false.");
            } else {
                System.out.println("True is false, so it's false now.");
            }
        } else {
            System.out.println("It's false.");
        }

    }
}
