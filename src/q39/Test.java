package q39;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("James", "diana", "Anna");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.compareTo(o2); //upper case letters appear before the lower case letters.
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(names);
    }
}
