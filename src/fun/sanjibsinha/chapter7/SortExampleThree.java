package fun.sanjibsinha.chapter7;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class SortExampleThree {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(210, 45, 258, 326, -12, 0, 89, 4, 9);
        Collections.sort(list);
        System.out.println(list);
    }

}
