package fun.sanjibsinha.chapter7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExampleOne {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("x", "n", "y", "a", "s", "j");
        Collections.sort(list);
        System.out.println(list);
    }
}
