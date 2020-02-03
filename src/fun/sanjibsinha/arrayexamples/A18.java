package fun.sanjibsinha.arrayexamples;

/*
Some more Array methods using external apache commons lang3
*/

//import org.apache.commons.lang3.ArrayUtils;

public class A18 {

    public static void main(String[] args){
        //we can reverse an Array
        char[] myName = {'s', 'a', 'n', 'j', 'i', 'b'};
        //now we can just add this characters to get my name
        System.out.println("My name : " + new String(myName));
        //let us reverse thsi character to see how my name looks in the mirror
        //ArrayUtils.reverse(myName);
        System.out.println("My name on the mirror : " + new String(myName));
    }
}
