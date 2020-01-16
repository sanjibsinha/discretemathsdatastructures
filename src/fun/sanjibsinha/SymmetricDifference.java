package fun.sanjibsinha;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class SymmetricDifference {

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        s1.add("a");
        s1.add("b");
        s1.add("c");

        Set<String> s2 = new HashSet<String>();
        s2.add("b");

        System.out.println(Collections.disjoint(s1, s2));
    }


}
